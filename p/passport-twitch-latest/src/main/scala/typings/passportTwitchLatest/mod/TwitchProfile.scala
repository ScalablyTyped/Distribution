package typings.passportTwitchLatest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitchProfile extends js.Object {
  var broadcaster_type: String
  var description: String
  var display_name: String
  var id: String
  var login: String
  var offline_image_url: String
  var profile_image_url: String
  var provider: String
  var `type`: String
  var view_count: Double
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
}

