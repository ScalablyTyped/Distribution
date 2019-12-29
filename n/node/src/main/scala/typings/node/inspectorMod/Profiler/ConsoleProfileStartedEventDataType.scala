package typings.node.inspectorMod.Profiler

import typings.node.inspectorMod.Debugger.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleProfileStartedEventDataType extends js.Object {
  var id: String
  /**
    * Location of console.profile().
    */
  var location: Location
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[String] = js.undefined
}

object ConsoleProfileStartedEventDataType {
  @scala.inline
  def apply(id: String, location: Location, title: String = null): ConsoleProfileStartedEventDataType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleProfileStartedEventDataType]
  }
}

