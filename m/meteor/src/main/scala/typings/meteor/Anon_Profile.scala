package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Profile extends js.Object {
  var profile: js.UndefOr[js.Object] = js.undefined
}

object Anon_Profile {
  @scala.inline
  def apply(profile: js.Object = null): Anon_Profile = {
    val __obj = js.Dynamic.literal()
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Profile]
  }
}

