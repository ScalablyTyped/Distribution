package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProfile extends js.Object {
  var profile: js.UndefOr[js.Object] = js.undefined
}

object AnonProfile {
  @scala.inline
  def apply(profile: js.Object = null): AnonProfile = {
    val __obj = js.Dynamic.literal()
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProfile]
  }
}

