package typings.passportAzureAd

import typings.passportAzureAd.passportAzureAdBooleans.`true`
import typings.passportAzureAd.passportAzureAdStrings.`0`
import typings.passportAzureAd.passportAzureAdStrings.`1`
import typings.passportAzureAd.passportAzureAdStrings.`2`
import typings.passportAzureAd.passportAzureAdStrings.error
import typings.passportAzureAd.passportAzureAdStrings.info
import typings.passportAzureAd.passportAzureAdStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @js.native
  trait IBaseStrategyOption extends StObject {
    
    var clientID: String = js.native
    
    var clockSkew: js.UndefOr[Double] = js.native
    
    var identityMetadata: String = js.native
    
    var isB2C: js.UndefOr[Boolean] = js.native
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.native
    
    var loggingLevel: js.UndefOr[info | warn | error] = js.native
    
    var loggingNoPII: js.UndefOr[Boolean] = js.native
    
    var validateIssuer: js.UndefOr[Boolean] = js.native
  }
  object IBaseStrategyOption {
    
    @scala.inline
    def apply(clientID: String, identityMetadata: String): IBaseStrategyOption = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseStrategyOption]
    }
    
    @scala.inline
    implicit class IBaseStrategyOptionMutableBuilder[Self <: IBaseStrategyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockSkew(value: Double): Self = StObject.set(x, "clockSkew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockSkewUndefined: Self = StObject.set(x, "clockSkew", js.undefined)
      
      @scala.inline
      def setIdentityMetadata(value: String): Self = StObject.set(x, "identityMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsB2C(value: Boolean): Self = StObject.set(x, "isB2C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsB2CUndefined: Self = StObject.set(x, "isB2C", js.undefined)
      
      @scala.inline
      def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value :_*))
      
      @scala.inline
      def setLoggingLevel(value: info | warn | error): Self = StObject.set(x, "loggingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingLevelUndefined: Self = StObject.set(x, "loggingLevel", js.undefined)
      
      @scala.inline
      def setLoggingNoPII(value: Boolean): Self = StObject.set(x, "loggingNoPII", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingNoPIIUndefined: Self = StObject.set(x, "loggingNoPII", js.undefined)
      
      @scala.inline
      def setValidateIssuer(value: Boolean): Self = StObject.set(x, "validateIssuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateIssuerUndefined: Self = StObject.set(x, "validateIssuer", js.undefined)
    }
  }
  
  @js.native
  trait ITokenPayload extends StObject {
    
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
    implicit class ITokenPayloadMutableBuilder[Self <: ITokenPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcr(value: `0` | `1`): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
      
      @scala.inline
      def setAio(value: String): Self = StObject.set(x, "aio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAioUndefined: Self = StObject.set(x, "aio", js.undefined)
      
      @scala.inline
      def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
      
      @scala.inline
      def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value :_*))
      
      @scala.inline
      def setAppid(value: String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
      
      @scala.inline
      def setAppidacr(value: `0` | `1` | `2`): Self = StObject.set(x, "appidacr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppidacrUndefined: Self = StObject.set(x, "appidacr", js.undefined)
      
      @scala.inline
      def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
      
      @scala.inline
      def setAzp(value: String): Self = StObject.set(x, "azp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzpUndefined: Self = StObject.set(x, "azp", js.undefined)
      
      @scala.inline
      def setAzpacr(value: `0` | `1` | `2`): Self = StObject.set(x, "azpacr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzpacrUndefined: Self = StObject.set(x, "azpacr", js.undefined)
      
      @scala.inline
      def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
      
      @scala.inline
      def setGroups(value: String | js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setHasgroups(value: `true`): Self = StObject.set(x, "hasgroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasgroupsUndefined: Self = StObject.set(x, "hasgroups", js.undefined)
      
      @scala.inline
      def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
      
      @scala.inline
      def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
      
      @scala.inline
      def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOidUndefined: Self = StObject.set(x, "oid", js.undefined)
      
      @scala.inline
      def setPreferred_name(value: String): Self = StObject.set(x, "preferred_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferred_nameUndefined: Self = StObject.set(x, "preferred_name", js.undefined)
      
      @scala.inline
      def setRh(value: String): Self = StObject.set(x, "rh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRhUndefined: Self = StObject.set(x, "rh", js.undefined)
      
      @scala.inline
      def setRoles(value: String): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      @scala.inline
      def setScp(value: String): Self = StObject.set(x, "scp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScpUndefined: Self = StObject.set(x, "scp", js.undefined)
      
      @scala.inline
      def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
      
      @scala.inline
      def setTid(value: String): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTidUndefined: Self = StObject.set(x, "tid", js.undefined)
      
      @scala.inline
      def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnique_nameUndefined: Self = StObject.set(x, "unique_name", js.undefined)
      
      @scala.inline
      def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpnUndefined: Self = StObject.set(x, "upn", js.undefined)
      
      @scala.inline
      def setUti(value: String): Self = StObject.set(x, "uti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtiUndefined: Self = StObject.set(x, "uti", js.undefined)
      
      @scala.inline
      def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerUndefined: Self = StObject.set(x, "ver", js.undefined)
    }
  }
  
  type VerifyCallback = js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit]
}
