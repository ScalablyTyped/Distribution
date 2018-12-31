package typings
package passportDashAzureDashAdLib.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenPayload extends js.Object {
  /** The "Authentication context class" claim. A value of "0" indicates the end-user authentication did not meet the requirements of ISO/IEC 29115. */
  var acr: js.UndefOr[
    passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`0` | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`1`
  ] = js.undefined
  /** An internal claim used by Azure AD to record data for token reuse. */
  var aio: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies how the subject of the token was authenticated.  */
  var amr: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** GUID represents the application ID of the client using the token. */
  var appid: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates how the client was authenticated. For a public client, the value is "0".
    * If client ID and client secret are used, the value is "1". If a client certificate was used for authentication, the value is "2". */
  var appidacr: js.UndefOr[
    passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`0` | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`1` | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`2`
  ] = js.undefined
  /** An App ID URI. Identifies the intended recipient of the token. */
  var aud: js.UndefOr[java.lang.String] = js.undefined
  /** Only present in v2.0 tokens. The application ID of the client using the token. */
  var azp: js.UndefOr[java.lang.String] = js.undefined
  /** Only present in v2.0 tokens. Indicates how the client was authenticated.
    * For a public client, the value is "0". If client ID and client secret are used, the value is "1". If a client certificate was used for authentication, the value is "2". */
  var azpacr: js.UndefOr[
    passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`0` | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`1` | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`2`
  ] = js.undefined
  /** The "exp" (expiration time) claim identifies the expiration time on or after which the JWT must not be accepted for processing. */
  var exp: js.UndefOr[scala.Double] = js.undefined
  /** Provides object IDs that represent the subject's group memberships. */
  var groups: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Denoting the user is in at least one group. */
  var hasgroups: js.UndefOr[passportDashAzureDashAdLib.passportDashAzureDashAdLibNumbers.`true`] = js.undefined
  /** "Issued At" indicates when the authentication for this token occurred. */
  var iat: js.UndefOr[scala.Double] = js.undefined
  /** A security token service(STS) URI. Identifies the STS that constructs and returns the token,
    * and the Azure AD tenant in which the user was authenticated.*/
  var iss: js.UndefOr[java.lang.String] = js.undefined
  /** Provides a human-readable value that identifies the subject of the token.
    * The value is not guaranteed to be unique, it is mutable, and it's designed to be used only for display purposes. The profile scope is required in order to receive this claim. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The "nbf" (not before) claim identifies the time before which the JWT must not be accepted for processing. */
  var nbf: js.UndefOr[scala.Double] = js.undefined
  /** GUID represents a user. This ID uniquely identifies the user across applications. */
  var oid: js.UndefOr[java.lang.String] = js.undefined
  /** Only present in v2.0 tokens. The primary username that represents the user. It could be an email address, phone number, or a generic username without a specified format */
  var preferred_name: js.UndefOr[java.lang.String] = js.undefined
  /** An internal claim used by Azure to revalidate tokens. */
  var rh: js.UndefOr[java.lang.String] = js.undefined
  /** The set of permissions exposed by your application that the requesting application has been given permission to call. */
  var roles: js.UndefOr[java.lang.String] = js.undefined
  /** The set of scopes exposed by your application for which the client application has requested (and received) consent. */
  var scp: js.UndefOr[java.lang.String] = js.undefined
  /** The principal about which the token asserts information, such as the user of an app. This value is immutable and cannot be reassigned or reused.
    * It can be used to perform authorization checks safely, such as when the token is used to access a resource,
    * and can be used as a key in database tables. Because the subject is always present in the tokens that Azure AD issues,
    * we recommend using this value in a general-purpose authorization system. The subject is, however, a pairwise identifier - it is unique to a particular application ID.   */
  var sub: js.UndefOr[java.lang.String] = js.undefined
  /** Represents the Azure AD tenant that the user is from. */
  var tid: js.UndefOr[java.lang.String] = js.undefined
  /** Only present in v1.0 tokens. Provides a human readable value that identifies the subject of the token.  */
  var unique_name: js.UndefOr[java.lang.String] = js.undefined
  /** The username of the user. May be a phone number, email address, or unformatted string. */
  var upn: js.UndefOr[java.lang.String] = js.undefined
  /** An internal claim used by Azure to revalidate tokens. */
  var uti: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates the version of the access token. */
  var ver: js.UndefOr[java.lang.String] = js.undefined
}

