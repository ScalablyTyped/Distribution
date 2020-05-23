package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openidClient.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserinfoResponse
  extends /* key */ StringDictionary[js.Any] {
  var address: js.UndefOr[Dictkey] = js.undefined
  var birthdate: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var email_verified: js.UndefOr[Boolean] = js.undefined
  var family_name: js.UndefOr[String] = js.undefined
  var gender: js.UndefOr[String] = js.undefined
  var given_name: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var middle_name: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nickname: js.UndefOr[String] = js.undefined
  var phone_number: js.UndefOr[String] = js.undefined
  var picture: js.UndefOr[String] = js.undefined
  var preferred_username: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
  var sub: String
  var updated_at: js.UndefOr[Double] = js.undefined
  var website: js.UndefOr[String] = js.undefined
  var zoneinfo: js.UndefOr[String] = js.undefined
}

object UserinfoResponse {
  @scala.inline
  def apply(
    sub: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    address: Dictkey = null,
    birthdate: String = null,
    email: String = null,
    email_verified: js.UndefOr[Boolean] = js.undefined,
    family_name: String = null,
    gender: String = null,
    given_name: String = null,
    locale: String = null,
    middle_name: String = null,
    name: String = null,
    nickname: String = null,
    phone_number: String = null,
    picture: String = null,
    preferred_username: String = null,
    profile: String = null,
    updated_at: js.UndefOr[Double] = js.undefined,
    website: String = null,
    zoneinfo: String = null
  ): UserinfoResponse = {
    val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (birthdate != null) __obj.updateDynamic("birthdate")(birthdate.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified.get.asInstanceOf[js.Any])
    if (family_name != null) __obj.updateDynamic("family_name")(family_name.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (given_name != null) __obj.updateDynamic("given_name")(given_name.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (middle_name != null) __obj.updateDynamic("middle_name")(middle_name.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number.asInstanceOf[js.Any])
    if (picture != null) __obj.updateDynamic("picture")(picture.asInstanceOf[js.Any])
    if (preferred_username != null) __obj.updateDynamic("preferred_username")(preferred_username.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (!js.isUndefined(updated_at)) __obj.updateDynamic("updated_at")(updated_at.get.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    if (zoneinfo != null) __obj.updateDynamic("zoneinfo")(zoneinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserinfoResponse]
  }
}

