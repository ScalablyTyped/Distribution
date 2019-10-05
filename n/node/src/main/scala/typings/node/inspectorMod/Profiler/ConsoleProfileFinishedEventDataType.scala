package typings.node.inspectorMod.Profiler

import typings.node.inspectorMod.Debugger.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleProfileFinishedEventDataType extends js.Object {
  var id: java.lang.String
  /**
    * Location of console.profileEnd().
    */
  var location: Location
  var profile: Profile
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ConsoleProfileFinishedEventDataType {
  @scala.inline
  def apply(id: java.lang.String, location: Location, profile: Profile, title: java.lang.String = null): ConsoleProfileFinishedEventDataType = {
    val __obj = js.Dynamic.literal(id = id, location = location, profile = profile)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ConsoleProfileFinishedEventDataType]
  }
}

