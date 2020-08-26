package typings.passportAzureAd.commonMod

import typings.passportAzureAd.passportAzureAdBooleans.`true`
import typings.passportAzureAd.passportAzureAdStrings.`0`
import typings.passportAzureAd.passportAzureAdStrings.`1`
import typings.passportAzureAd.passportAzureAdStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenPayload extends js.Object {
  /** The "Authentication context class" claim. A value of "0" indicates the end-user authentication did not meet the requirements of ISO/IEC 29115. */
  var acr: js.UndefOr[`0` | `1`] = js.native
  /** An internal claim used by Azure AD to record data for token reuse. */
  var aio: js.UndefOr[String] = js.native
  /** Identifies how the subject of the token was authenticated.  */
  var amr: js.UndefOr[js.Array[String]] = js.native
  /** GUID represents the application ID of the client using the token. */
  var appid: js.UndefOr[String] = js.native
  /** Indicates how the client was authenticated. For a public client, the value is "0".
    * If client ID and client secret are used, the value is "1". If a client certificate was used for authentication, the value is "2". */
  var appidacr: js.UndefOr[`0` | `1` | `2`] = js.native
  /** An App ID URI. Identifies the intended recipient of the token. */
  var aud: js.UndefOr[String] = js.native
  /** Only present in v2.0 tokens. The application ID of the client using the token. */
  var azp: js.UndefOr[String] = js.native
  /** Only present in v2.0 tokens. Indicates how the client was authenticated.
    * For a public client, the value is "0". If client ID and client secret are used, the value is "1". If a client certificate was used for authentication, the value is "2". */
  var azpacr: js.UndefOr[`0` | `1` | `2`] = js.native
  /** The "exp" (expiration time) claim identifies the expiration time on or after which the JWT must not be accepted for processing. */
  var exp: js.UndefOr[Double] = js.native
  /** Provides object IDs that represent the subject's group memberships. */
  var groups: js.UndefOr[String | js.Array[String]] = js.native
  /** Denoting the user is in at least one group. */
  var hasgroups: js.UndefOr[`true`] = js.native
  /** "Issued At" indicates when the authentication for this token occurred. */
  var iat: js.UndefOr[Double] = js.native
  /** A security token service(STS) URI. Identifies the STS that constructs and returns the token,
    * and the Azure AD tenant in which the user was authenticated.*/
  var iss: js.UndefOr[String] = js.native
  /** Provides a human-readable value that identifies the subject of the token.
    * The value is not guaranteed to be unique, it is mutable, and it's designed to be used only for display purposes. The profile scope is required in order to receive this claim. */
  var name: js.UndefOr[String] = js.native
  /** The "nbf" (not before) claim identifies the time before which the JWT must not be accepted for processing. */
  var nbf: js.UndefOr[Double] = js.native
  /** GUID represents a user. This ID uniquely identifies the user across applications. */
  var oid: js.UndefOr[String] = js.native
  /** Only present in v2.0 tokens. The primary username that represents the user. It could be an email address, phone number, or a generic username without a specified format */
  var preferred_name: js.UndefOr[String] = js.native
  /** An internal claim used by Azure to revalidate tokens. */
  var rh: js.UndefOr[String] = js.native
  /** The set of permissions exposed by your application that the requesting application has been given permission to call. */
  var roles: js.UndefOr[String] = js.native
  /** The set of scopes exposed by your application for which the client application has requested (and received) consent. */
  var scp: js.UndefOr[String] = js.native
  /** The principal about which the token asserts information, such as the user of an app. This value is immutable and cannot be reassigned or reused.
    * It can be used to perform authorization checks safely, such as when the token is used to access a resource,
    * and can be used as a key in database tables. Because the subject is always present in the tokens that Azure AD issues,
    * we recommend using this value in a general-purpose authorization system. The subject is, however, a pairwise identifier - it is unique to a particular application ID.   */
  var sub: js.UndefOr[String] = js.native
  /** Represents the Azure AD tenant that the user is from. */
  var tid: js.UndefOr[String] = js.native
  /** Only present in v1.0 tokens. Provides a human readable value that identifies the subject of the token.  */
  var unique_name: js.UndefOr[String] = js.native
  /** The username of the user. May be a phone number, email address, or unformatted string. */
  var upn: js.UndefOr[String] = js.native
  /** An internal claim used by Azure to revalidate tokens. */
  var uti: js.UndefOr[String] = js.native
  /** Indicates the version of the access token. */
  var ver: js.UndefOr[String] = js.native
}

object ITokenPayload {
  @scala.inline
  def apply(): ITokenPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITokenPayload]
  }
  @scala.inline
  implicit class ITokenPayloadOps[Self <: ITokenPayload] (val x: Self) extends AnyVal {
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
    def setAcr(value: `0` | `1`): Self = this.set("acr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcr: Self = this.set("acr", js.undefined)
    @scala.inline
    def setAio(value: String): Self = this.set("aio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAio: Self = this.set("aio", js.undefined)
    @scala.inline
    def setAmrVarargs(value: String*): Self = this.set("amr", js.Array(value :_*))
    @scala.inline
    def setAmr(value: js.Array[String]): Self = this.set("amr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmr: Self = this.set("amr", js.undefined)
    @scala.inline
    def setAppid(value: String): Self = this.set("appid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppid: Self = this.set("appid", js.undefined)
    @scala.inline
    def setAppidacr(value: `0` | `1` | `2`): Self = this.set("appidacr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppidacr: Self = this.set("appidacr", js.undefined)
    @scala.inline
    def setAud(value: String): Self = this.set("aud", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAud: Self = this.set("aud", js.undefined)
    @scala.inline
    def setAzp(value: String): Self = this.set("azp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzp: Self = this.set("azp", js.undefined)
    @scala.inline
    def setAzpacr(value: `0` | `1` | `2`): Self = this.set("azpacr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzpacr: Self = this.set("azpacr", js.undefined)
    @scala.inline
    def setExp(value: Double): Self = this.set("exp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExp: Self = this.set("exp", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: String | js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setHasgroups(value: `true`): Self = this.set("hasgroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasgroups: Self = this.set("hasgroups", js.undefined)
    @scala.inline
    def setIat(value: Double): Self = this.set("iat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIat: Self = this.set("iat", js.undefined)
    @scala.inline
    def setIss(value: String): Self = this.set("iss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIss: Self = this.set("iss", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNbf(value: Double): Self = this.set("nbf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNbf: Self = this.set("nbf", js.undefined)
    @scala.inline
    def setOid(value: String): Self = this.set("oid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOid: Self = this.set("oid", js.undefined)
    @scala.inline
    def setPreferred_name(value: String): Self = this.set("preferred_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferred_name: Self = this.set("preferred_name", js.undefined)
    @scala.inline
    def setRh(value: String): Self = this.set("rh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRh: Self = this.set("rh", js.undefined)
    @scala.inline
    def setRoles(value: String): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    @scala.inline
    def setScp(value: String): Self = this.set("scp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScp: Self = this.set("scp", js.undefined)
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSub: Self = this.set("sub", js.undefined)
    @scala.inline
    def setTid(value: String): Self = this.set("tid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTid: Self = this.set("tid", js.undefined)
    @scala.inline
    def setUnique_name(value: String): Self = this.set("unique_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique_name: Self = this.set("unique_name", js.undefined)
    @scala.inline
    def setUpn(value: String): Self = this.set("upn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpn: Self = this.set("upn", js.undefined)
    @scala.inline
    def setUti(value: String): Self = this.set("uti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUti: Self = this.set("uti", js.undefined)
    @scala.inline
    def setVer(value: String): Self = this.set("ver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVer: Self = this.set("ver", js.undefined)
  }
  
}

