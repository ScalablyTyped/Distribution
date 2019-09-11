package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.openidDashClient.Anon_Country
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserinfoResponse
  extends /* key */ StringDictionary[js.Any] {
  var address: js.UndefOr[Anon_Country] = js.undefined
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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    address: Anon_Country = null,
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
    updated_at: Int | Double = null,
    website: String = null,
    zoneinfo: String = null
  ): UserinfoResponse = {
    val __obj = js.Dynamic.literal(sub = sub)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (address != null) __obj.updateDynamic("address")(address)
    if (birthdate != null) __obj.updateDynamic("birthdate")(birthdate)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified)
    if (family_name != null) __obj.updateDynamic("family_name")(family_name)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (given_name != null) __obj.updateDynamic("given_name")(given_name)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (middle_name != null) __obj.updateDynamic("middle_name")(middle_name)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number)
    if (picture != null) __obj.updateDynamic("picture")(picture)
    if (preferred_username != null) __obj.updateDynamic("preferred_username")(preferred_username)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website)
    if (zoneinfo != null) __obj.updateDynamic("zoneinfo")(zoneinfo)
    __obj.asInstanceOf[UserinfoResponse]
  }
}

