package typings.passportFacebookToken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile
  extends typings.passport.mod.Profile {
  var _json: js.Any = js.native
  var _raw: String = js.native
  var gender: String = js.native
}

object Profile {
  @scala.inline
  def apply(_json: js.Any, _raw: String, displayName: String, gender: String, id: String, provider: String): Profile = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_json(value: js.Any): Self = this.set("_json", value.asInstanceOf[js.Any])
    @scala.inline
    def set_raw(value: String): Self = this.set("_raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
  }
  
}

