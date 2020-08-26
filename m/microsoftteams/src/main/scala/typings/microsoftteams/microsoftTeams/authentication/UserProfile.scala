package typings.microsoftteams.microsoftTeams.authentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfile extends js.Object {
  /**
    * Identifies how the subject of the token was authenticated.
    */
  var amr: js.Array[String] = js.native
  /**
    * The intended recipient of the token. The application that receives the token must verify that the audience
    * value is correct and reject any tokens intended for a different audience.
    */
  var aud: String = js.native
  /**
    * Defines the time interval within which a token is valid. The service that validates the token should verify
    * that the current date is within the token lifetime; otherwise it should reject the token. The service might
    * allow for up to five minutes beyond the token lifetime to account for any differences in clock time ("time
    * skew") between Azure AD and the service.
    */
  var exp: Double = js.native
  /**
    * Provides the last name, surname, or family name of the user as defined in the Azure AD user object.
    */
  var family_name: String = js.native
  /**
    * Provides the first or "given" name of the user, as set on the Azure AD user object.
    */
  var given_name: String = js.native
  /**
    * Stores the time at which the token was issued. It is often used to measure token freshness.
    */
  var iat: Double = js.native
  /**
    * Identifies the security token service (STS) that constructs and returns the token. In the tokens that Azure AD
    * returns, the issuer is sts.windows.net. The GUID in the issuer claim value is the tenant ID of the Azure AD
    * directory. The tenant ID is an immutable and reliable identifier of the directory.
    */
  var iss: String = js.native
  var nbf: Double = js.native
  /**
    * Contains a unique identifier of an object in Azure AD. This value is immutable and cannot be reassigned or
    * reused. Use the object ID to identify an object in queries to Azure AD.
    */
  var oid: String = js.native
  /**
    * Identifies the principal about which the token asserts information, such as the user of an application.
    * This value is immutable and cannot be reassigned or reused, so it can be used to perform authorization
    * checks safely. Because the subject is always present in the tokens the Azure AD issues, we recommended
    * using this value in a general-purpose authorization system.
    */
  var sub: String = js.native
  /**
    * An immutable, non-reusable identifier that identifies the directory tenant that issued the token. You can
    * use this value to access tenant-specific directory resources in a multitenant application. For example,
    * you can use this value to identify the tenant in a call to the Graph API.
    */
  var tid: String = js.native
  /**
    * Provides a human-readable value that identifies the subject of the token. This value is not guaranteed to
    * be unique within a tenant and is designed to be used only for display purposes.
    */
  var unique_name: String = js.native
  /**
    * Stores the user name of the user principal.
    */
  var upn: String = js.native
  /**
    * Stores the version number of the token.
    */
  var ver: String = js.native
}

object UserProfile {
  @scala.inline
  def apply(
    amr: js.Array[String],
    aud: String,
    exp: Double,
    family_name: String,
    given_name: String,
    iat: Double,
    iss: String,
    nbf: Double,
    oid: String,
    sub: String,
    tid: String,
    unique_name: String,
    upn: String,
    ver: String
  ): UserProfile = {
    val __obj = js.Dynamic.literal(amr = amr.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], nbf = nbf.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], upn = upn.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfile]
  }
  @scala.inline
  implicit class UserProfileOps[Self <: UserProfile] (val x: Self) extends AnyVal {
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
    def setAmrVarargs(value: String*): Self = this.set("amr", js.Array(value :_*))
    @scala.inline
    def setAmr(value: js.Array[String]): Self = this.set("amr", value.asInstanceOf[js.Any])
    @scala.inline
    def setAud(value: String): Self = this.set("aud", value.asInstanceOf[js.Any])
    @scala.inline
    def setExp(value: Double): Self = this.set("exp", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamily_name(value: String): Self = this.set("family_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setGiven_name(value: String): Self = this.set("given_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setIat(value: Double): Self = this.set("iat", value.asInstanceOf[js.Any])
    @scala.inline
    def setIss(value: String): Self = this.set("iss", value.asInstanceOf[js.Any])
    @scala.inline
    def setNbf(value: Double): Self = this.set("nbf", value.asInstanceOf[js.Any])
    @scala.inline
    def setOid(value: String): Self = this.set("oid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def setTid(value: String): Self = this.set("tid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnique_name(value: String): Self = this.set("unique_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpn(value: String): Self = this.set("upn", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: String): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

