package typings.node.inspectorMod.ProfilerNs

import typings.node.inspectorMod.DebuggerNs.Location
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
    val __obj = js.Dynamic.literal(id = id, location = location)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ConsoleProfileStartedEventDataType]
  }
}

