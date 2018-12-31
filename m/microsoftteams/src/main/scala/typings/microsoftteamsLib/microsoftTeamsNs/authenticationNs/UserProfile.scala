package typings
package microsoftteamsLib.microsoftTeamsNs.authenticationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  /**
    * Identifies how the subject of the token was authenticated.
    */
  var amr: js.Array[java.lang.String]
  /**
    * The intended recipient of the token. The application that receives the token must verify that the audience
    * value is correct and reject any tokens intended for a different audience.
    */
  var aud: java.lang.String
  /**
    * Defines the time interval within which a token is valid. The service that validates the token should verify
    * that the current date is within the token lifetime; otherwise it should reject the token. The service might
    * allow for up to five minutes beyond the token lifetime to account for any differences in clock time ("time
    * skew") between Azure AD and the service.
    */
  var exp: scala.Double
  /**
    * Provides the last name, surname, or family name of the user as defined in the Azure AD user object.
    */
  var family_name: java.lang.String
  /**
    * Provides the first or "given" name of the user, as set on the Azure AD user object.
    */
  var given_name: java.lang.String
  /**
    * Stores the time at which the token was issued. It is often used to measure token freshness.
    */
  var iat: scala.Double
  /**
    * Identifies the security token service (STS) that constructs and returns the token. In the tokens that Azure AD
    * returns, the issuer is sts.windows.net. The GUID in the issuer claim value is the tenant ID of the Azure AD
    * directory. The tenant ID is an immutable and reliable identifier of the directory.
    */
  var iss: java.lang.String
  var nbf: scala.Double
  /**
    * Contains a unique identifier of an object in Azure AD. This value is immutable and cannot be reassigned or
    * reused. Use the object ID to identify an object in queries to Azure AD.
    */
  var oid: java.lang.String
  /**
    * Identifies the principal about which the token asserts information, such as the user of an application.
    * This value is immutable and cannot be reassigned or reused, so it can be used to perform authorization
    * checks safely. Because the subject is always present in the tokens the Azure AD issues, we recommended
    * using this value in a general-purpose authorization system.
    */
  var sub: java.lang.String
  /**
    * An immutable, non-reusable identifier that identifies the directory tenant that issued the token. You can
    * use this value to access tenant-specific directory resources in a multitenant application. For example,
    * you can use this value to identify the tenant in a call to the Graph API.
    */
  var tid: java.lang.String
  /**
    * Provides a human-readable value that identifies the subject of the token. This value is not guaranteed to
    * be unique within a tenant and is designed to be used only for display purposes.
    */
  var unique_name: java.lang.String
  /**
    * Stores the user name of the user principal.
    */
  var upn: java.lang.String
  /**
    * Stores the version number of the token.
    */
  var ver: java.lang.String
}

