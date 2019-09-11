package typings.openidDashClient.openidDashClientMod

import typings.openidDashClient.Anon_Country
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
    address: Anon_Country = null,
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
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp, iat = iat, iss = iss, sub = sub)
    if (acr != null) __obj.updateDynamic("acr")(acr)
    if (address != null) __obj.updateDynamic("address")(address)
    if (amr != null) __obj.updateDynamic("amr")(amr)
    if (at_hash != null) __obj.updateDynamic("at_hash")(at_hash)
    if (auth_time != null) __obj.updateDynamic("auth_time")(auth_time.asInstanceOf[js.Any])
    if (azp != null) __obj.updateDynamic("azp")(azp)
    if (birthdate != null) __obj.updateDynamic("birthdate")(birthdate)
    if (c_hash != null) __obj.updateDynamic("c_hash")(c_hash)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified)
    if (family_name != null) __obj.updateDynamic("family_name")(family_name)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (given_name != null) __obj.updateDynamic("given_name")(given_name)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (middle_name != null) __obj.updateDynamic("middle_name")(middle_name)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number)
    if (picture != null) __obj.updateDynamic("picture")(picture)
    if (preferred_username != null) __obj.updateDynamic("preferred_username")(preferred_username)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (s_hash != null) __obj.updateDynamic("s_hash")(s_hash)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website)
    if (zoneinfo != null) __obj.updateDynamic("zoneinfo")(zoneinfo)
    __obj.asInstanceOf[IdTokenClaims]
  }
}

