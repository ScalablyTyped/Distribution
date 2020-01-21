package typings.openidClient.mod

import typings.openidClient.AnonCountry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdTokenClaims extends UserinfoResponse {
  var acr: js.UndefOr[String] = js.undefined
  var amr: js.UndefOr[js.Array[String]] = js.undefined
  var at_hash: js.UndefOr[String] = js.undefined
  var aud: String | js.Array[String]
  var auth_time: js.UndefOr[Double] = js.undefined
  var azp: js.UndefOr[String] = js.undefined
  var c_hash: js.UndefOr[String] = js.undefined
  var exp: Double
  var iat: Double
  var iss: String
  var nonce: js.UndefOr[String] = js.undefined
  var s_hash: js.UndefOr[String] = js.undefined
}

object IdTokenClaims {
  @scala.inline
  def apply(
    aud: String | js.Array[String],
    exp: Double,
    iat: Double,
    iss: String,
    sub: String,
    acr: String = null,
    address: AnonCountry = null,
    amr: js.Array[String] = null,
    at_hash: String = null,
    auth_time: Int | Double = null,
    azp: String = null,
    birthdate: String = null,
    c_hash: String = null,
    email: String = null,
    email_verified: js.UndefOr[Boolean] = js.undefined,
    family_name: String = null,
    gender: String = null,
    given_name: String = null,
    locale: String = null,
    middle_name: String = null,
    name: String = null,
    nickname: String = null,
    nonce: String = null,
    phone_number: String = null,
    picture: String = null,
    preferred_username: String = null,
    profile: String = null,
    s_hash: String = null,
    updated_at: Int | Double = null,
    website: String = null,
    zoneinfo: String = null
  ): IdTokenClaims = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    if (acr != null) __obj.updateDynamic("acr")(acr.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (amr != null) __obj.updateDynamic("amr")(amr.asInstanceOf[js.Any])
    if (at_hash != null) __obj.updateDynamic("at_hash")(at_hash.asInstanceOf[js.Any])
    if (auth_time != null) __obj.updateDynamic("auth_time")(auth_time.asInstanceOf[js.Any])
    if (azp != null) __obj.updateDynamic("azp")(azp.asInstanceOf[js.Any])
    if (birthdate != null) __obj.updateDynamic("birthdate")(birthdate.asInstanceOf[js.Any])
    if (c_hash != null) __obj.updateDynamic("c_hash")(c_hash.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified.asInstanceOf[js.Any])
    if (family_name != null) __obj.updateDynamic("family_name")(family_name.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (given_name != null) __obj.updateDynamic("given_name")(given_name.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (middle_name != null) __obj.updateDynamic("middle_name")(middle_name.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number.asInstanceOf[js.Any])
    if (picture != null) __obj.updateDynamic("picture")(picture.asInstanceOf[js.Any])
    if (preferred_username != null) __obj.updateDynamic("preferred_username")(preferred_username.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (s_hash != null) __obj.updateDynamic("s_hash")(s_hash.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    if (zoneinfo != null) __obj.updateDynamic("zoneinfo")(zoneinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenClaims]
  }
}

