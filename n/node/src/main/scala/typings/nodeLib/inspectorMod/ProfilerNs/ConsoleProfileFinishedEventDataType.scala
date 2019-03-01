package typings
package nodeLib.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleProfileFinishedEventDataType extends js.Object {
  var id: java.lang.String
  /**
    * Location of console.profileEnd().
    */
  var location: nodeLib.inspectorMod.DebuggerNs.Location
  var profile: Profile
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ConsoleProfileFinishedEventDataType {
  @scala.inline
  def apply(
    id: java.lang.String,
    location: nodeLib.inspectorMod.DebuggerNs.Location,
    profile: Profile,
    title: java.lang.String = null
  ): ConsoleProfileFinishedEventDataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("profile")(profile)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ConsoleProfileFinishedEventDataType]
  }
}

