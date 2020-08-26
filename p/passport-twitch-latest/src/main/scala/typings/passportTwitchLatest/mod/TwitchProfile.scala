package typings.passportTwitchLatest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitchProfile extends js.Object {
  var broadcaster_type: String = js.native
  var description: String = js.native
  var display_name: String = js.native
  var id: String = js.native
  var login: String = js.native
  var offline_image_url: String = js.native
  var profile_image_url: String = js.native
  var provider: String = js.native
  var `type`: String = js.native
  var view_count: Double = js.native
}

object TwitchProfile {
  @scala.inline
  def apply(
    broadcaster_type: String,
    description: String,
    display_name: String,
    id: String,
    login: String,
    offline_image_url: String,
    profile_image_url: String,
    provider: String,
    `type`: String,
    view_count: Double
  ): TwitchProfile = {
    val __obj = js.Dynamic.literal(broadcaster_type = broadcaster_type.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], offline_image_url = offline_image_url.asInstanceOf[js.Any], profile_image_url = profile_image_url.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], view_count = view_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchProfile]
  }
  @scala.inline
  implicit class TwitchProfileOps[Self <: TwitchProfile] (val x: Self) extends AnyVal {
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
    def setBroadcaster_type(value: String): Self = this.set("broadcaster_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffline_image_url(value: String): Self = this.set("offline_image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfile_image_url(value: String): Self = this.set("profile_image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setView_count(value: Double): Self = this.set("view_count", value.asInstanceOf[js.Any])
  }
  
}

