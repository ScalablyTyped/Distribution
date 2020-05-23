package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var profile: js.UndefOr[js.Object] = js.undefined
}

object Profile {
  @scala.inline
  def apply(profile: js.Object = null): Profile = {
    val __obj = js.Dynamic.literal()
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

