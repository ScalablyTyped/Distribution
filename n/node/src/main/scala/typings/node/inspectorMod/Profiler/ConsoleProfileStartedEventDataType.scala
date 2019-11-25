package typings.node.inspectorMod.Profiler

import typings.node.inspectorMod.Debugger.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleProfileStartedEventDataType extends js.Object {
  var id: java.lang.String
  /**
    * Location of console.profile().
    */
  var location: Location
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ConsoleProfileStartedEventDataType {
  @scala.inline
  def apply(id: java.lang.String, location: Location, title: java.lang.String = null): ConsoleProfileStartedEventDataType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleProfileStartedEventDataType]
  }
}

