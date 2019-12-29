package typings.node.inspectorMod.Profiler

import typings.node.inspectorMod.Debugger.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleProfileFinishedEventDataType extends js.Object {
  var id: String
  /**
    * Location of console.profileEnd().
    */
  var location: Location
  var profile: Profile
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[String] = js.undefined
}

object ConsoleProfileFinishedEventDataType {
  @scala.inline
  def apply(id: String, location: Location, profile: Profile, title: String = null): ConsoleProfileFinishedEventDataType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleProfileFinishedEventDataType]
  }
}

