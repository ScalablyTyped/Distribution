package typings.passportDashAzureDashAd.commonMod

import typings.passportDashAzureDashAd.passportDashAzureDashAdBooleans.`true`
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.`0`
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.`1`
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenPayload extends js.Object {
  /** The "Authentication context class" claim. A value of "0" indicates the end-user authentication did not meet the requirements of ISO/IEC 29115. */
  var acr: js.UndefOr[`0` | `1`] = js.undefined
  /** An internal claim used by Azure AD to record data for token reuse. */
  var aio: js.UndefOr[String] = js.undefined
  /** Identifies how the subject of the token was authenticated.  */
  var amr: js.UndefOr[js.Array[String]] = js.undefined
  /** GUID represents the application ID of the client using the token. */
  var appid: js.UndefOr[String] = js.undefined
  /** Indicates how the client was authenticated. For a public client, the value is "0".
    * If client ID and client secret are used, the value is "1". If a client certificate was used for authentication, the value is "2". */
  var appidacr: js.UndefOr[`0` | `1` | `2`] = js.undefined
  /** An App ID URI. Identifies the intended recipient of the token. */
  var aud: js.UndefOr[String] = js.undefined
  /** Only present in v2.0 tokens. The application ID of the client using the token. */
  var azp: js.UndefOr[String] = js.undefined
  /** Only present in v2.0 tokens. Indicates how the client was authenticated.
    * For a public client, the value is "0". If client ID and client secret are used, the value is "1". If a client certificate was used for authentication, the value is "2". */
  var azpacr: js.UndefOr[`0` | `1` | `2`] = js.undefined
  /** The "exp" (expiration time) claim identifies the expiration time on or after which the JWT must not be accepted for processing. */
  var exp: js.UndefOr[Double] = js.undefined
  /** Provides object IDs that represent the subject's group memberships. */
  var groups: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Denoting the user is in at least one group. */
  var hasgroups: js.UndefOr[`true`] = js.undefined
  /** "Issued At" indicates when the authentication for this token occurred. */
  var iat: js.UndefOr[Double] = js.undefined
  /** A security token service(STS) URI. Identifies the STS that constructs and returns the token,
    * and the Azure AD tenant in which the user was authenticated.*/
  var iss: js.UndefOr[String] = js.undefined
  /** Provides a human-readable value that identifies the subject of the token.
    * The value is not guaranteed to be unique, it is mutable, and it's designed to be used only for display purposes. The profile scope is required in order to receive this claim. */
  var name: js.UndefOr[String] = js.undefined
  /** The "nbf" (not before) claim identifies the time before which the JWT must not be accepted for processing. */
  var nbf: js.UndefOr[Double] = js.undefined
  /** GUID represents a user. This ID uniquely identifies the user across applications. */
  var oid: js.UndefOr[String] = js.undefined
  /** Only present in v2.0 tokens. The primary username that represents the user. It could be an email address, phone number, or a generic username without a specified format */
  var preferred_name: js.UndefOr[String] = js.undefined
  /** An internal claim used by Azure to revalidate tokens. */
  var rh: js.UndefOr[String] = js.undefined
  /** The set of permissions exposed by your application that the requesting application has been given permission to call. */
  var roles: js.UndefOr[String] = js.undefined
  /** The set of scopes exposed by your application for which the client application has requested (and received) consent. */
  var scp: js.UndefOr[String] = js.undefined
  /** The principal about which the token asserts information, such as the user of an app. This value is immutable and cannot be reassigned or reused.
    * It can be used to perform authorization checks safely, such as when the token is used to access a resource,
    * and can be used as a key in database tables. Because the subject is always present in the tokens that Azure AD issues,
    * we recommend using this value in a general-purpose authorization system. The subject is, however, a pairwise identifier - it is unique to a particular application ID.   */
  var sub: js.UndefOr[String] = js.undefined
  /** Represents the Azure AD tenant that the user is from. */
  var tid: js.UndefOr[String] = js.undefined
  /** Only present in v1.0 tokens. Provides a human readable value that identifies the subject of the token.  */
  var unique_name: js.UndefOr[String] = js.undefined
  /** The username of the user. May be a phone number, email address, or unformatted string. */
  var upn: js.UndefOr[String] = js.undefined
  /** An internal claim used by Azure to revalidate tokens. */
  var uti: js.UndefOr[String] = js.undefined
  /** Indicates the version of the access token. */
  var ver: js.UndefOr[String] = js.undefined
}

object ITokenPayload {
  @scala.inline
  def apply(
    acr: `0` | `1` = null,
    aio: String = null,
    amr: js.Array[String] = null,
    appid: String = null,
    appidacr: `0` | `1` | `2` = null,
    aud: String = null,
    azp: String = null,
    azpacr: `0` | `1` | `2` = null,
    exp: Int | Double = null,
    groups: String | js.Array[String] = null,
    hasgroups: `true` = null,
    iat: Int | Double = null,
    iss: String = null,
    name: String = null,
    nbf: Int | Double = null,
    oid: String = null,
    preferred_name: String = null,
    rh: String = null,
    roles: String = null,
    scp: String = null,
    sub: String = null,
    tid: String = null,
    unique_name: String = null,
    upn: String = null,
    uti: String = null,
    ver: String = null
  ): ITokenPayload = {
    val __obj = js.Dynamic.literal()
    if (acr != null) __obj.updateDynamic("acr")(acr.asInstanceOf[js.Any])
    if (aio != null) __obj.updateDynamic("aio")(aio.asInstanceOf[js.Any])
    if (amr != null) __obj.updateDynamic("amr")(amr.asInstanceOf[js.Any])
    if (appid != null) __obj.updateDynamic("appid")(appid.asInstanceOf[js.Any])
    if (appidacr != null) __obj.updateDynamic("appidacr")(appidacr.asInstanceOf[js.Any])
    if (aud != null) __obj.updateDynamic("aud")(aud.asInstanceOf[js.Any])
    if (azp != null) __obj.updateDynamic("azp")(azp.asInstanceOf[js.Any])
    if (azpacr != null) __obj.updateDynamic("azpacr")(azpacr.asInstanceOf[js.Any])
    if (exp != null) __obj.updateDynamic("exp")(exp.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (hasgroups != null) __obj.updateDynamic("hasgroups")(hasgroups.asInstanceOf[js.Any])
    if (iat != null) __obj.updateDynamic("iat")(iat.asInstanceOf[js.Any])
    if (iss != null) __obj.updateDynamic("iss")(iss.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nbf != null) __obj.updateDynamic("nbf")(nbf.asInstanceOf[js.Any])
    if (oid != null) __obj.updateDynamic("oid")(oid.asInstanceOf[js.Any])
    if (preferred_name != null) __obj.updateDynamic("preferred_name")(preferred_name.asInstanceOf[js.Any])
    if (rh != null) __obj.updateDynamic("rh")(rh.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (scp != null) __obj.updateDynamic("scp")(scp.asInstanceOf[js.Any])
    if (sub != null) __obj.updateDynamic("sub")(sub.asInstanceOf[js.Any])
    if (tid != null) __obj.updateDynamic("tid")(tid.asInstanceOf[js.Any])
    if (unique_name != null) __obj.updateDynamic("unique_name")(unique_name.asInstanceOf[js.Any])
    if (upn != null) __obj.updateDynamic("upn")(upn.asInstanceOf[js.Any])
    if (uti != null) __obj.updateDynamic("uti")(uti.asInstanceOf[js.Any])
    if (ver != null) __obj.updateDynamic("ver")(ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenPayload]
  }
}

