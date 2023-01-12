package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the authentication-specific part of the SDK.
  * This object is used for starting or completing authentication flows.
  */
object authentication {
  
  trait AuthTokenRequest extends StObject {
    
    /**
      * An optional list of claims which to pass to AAD when requesting the access token.
      */
    var claims: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A function that is called if the token request fails, with the reason for the failure.
      */
    var failureCallback: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
    
    /**
      * An optional list of resource for which to acquire the access token; only used for full trust apps.
      */
    var resources: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An optional flag indicating whether to attempt the token acquisition silently or allow a prompt to be shown.
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that is called if the token request succeeds, with the resulting token.
      */
    var successCallback: js.UndefOr[js.Function1[/* token */ String, Unit]] = js.undefined
  }
  object AuthTokenRequest {
    
    inline def apply(): AuthTokenRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthTokenRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthTokenRequest] (val x: Self) extends AnyVal {
      
      inline def setClaims(value: js.Array[String]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setClaimsVarargs(value: String*): Self = StObject.set(x, "claims", js.Array(value*))
      
      inline def setFailureCallback(value: /* reason */ String => Unit): Self = StObject.set(x, "failureCallback", js.Any.fromFunction1(value))
      
      inline def setFailureCallbackUndefined: Self = StObject.set(x, "failureCallback", js.undefined)
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSuccessCallback(value: /* token */ String => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction1(value))
      
      inline def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
    }
  }
  
  trait AuthenticateParameters extends StObject {
    
    /**
      * A function that is called if the authentication fails, with the reason for the failure returned from the authentication pop-up.
      */
    var failureCallback: js.UndefOr[js.Function1[/* reason */ js.UndefOr[String], Unit]] = js.undefined
    
    /**
      * The preferred height for the pop-up. This value can be ignored if outside the acceptable bounds.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * A function that is called if the authentication succeeds, with the result returned from the authentication pop-up.
      */
    var successCallback: js.UndefOr[js.Function1[/* result */ js.UndefOr[String], Unit]] = js.undefined
    
    /**
      * The URL for the authentication pop-up.
      */
    var url: String
    
    /**
      * The preferred width for the pop-up. This value can be ignored if outside the acceptable bounds.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object AuthenticateParameters {
    
    inline def apply(url: String): AuthenticateParameters = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticateParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticateParameters] (val x: Self) extends AnyVal {
      
      inline def setFailureCallback(value: /* reason */ js.UndefOr[String] => Unit): Self = StObject.set(x, "failureCallback", js.Any.fromFunction1(value))
      
      inline def setFailureCallbackUndefined: Self = StObject.set(x, "failureCallback", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSuccessCallback(value: /* result */ js.UndefOr[String] => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction1(value))
      
      inline def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Hide from docs.
    * ------
    */
  trait UserProfile extends StObject {
    
    /**
      * Identifies how the subject of the token was authenticated.
      */
    var amr: js.Array[String]
    
    /**
      * The intended recipient of the token. The application that receives the token must verify that the audience
      * value is correct and reject any tokens intended for a different audience.
      */
    var aud: String
    
    /**
      * Defines the time interval within which a token is valid. The service that validates the token should verify
      * that the current date is within the token lifetime; otherwise it should reject the token. The service might
      * allow for up to five minutes beyond the token lifetime to account for any differences in clock time ("time
      * skew") between Azure AD and the service.
      */
    var exp: Double
    
    /**
      * Provides the last name, surname, or family name of the user as defined in the Azure AD user object.
      */
    var family_name: String
    
    /**
      * Provides the first or "given" name of the user, as set on the Azure AD user object.
      */
    var given_name: String
    
    /**
      * Stores the time at which the token was issued. It is often used to measure token freshness.
      */
    var iat: Double
    
    /**
      * Identifies the security token service (STS) that constructs and returns the token. In the tokens that Azure AD
      * returns, the issuer is sts.windows.net. The GUID in the issuer claim value is the tenant ID of the Azure AD
      * directory. The tenant ID is an immutable and reliable identifier of the directory.
      */
    var iss: String
    
    var nbf: Double
    
    /**
      * Contains a unique identifier of an object in Azure AD. This value is immutable and cannot be reassigned or
      * reused. Use the object ID to identify an object in queries to Azure AD.
      */
    var oid: String
    
    /**
      * Identifies the principal about which the token asserts information, such as the user of an application.
      * This value is immutable and cannot be reassigned or reused, so it can be used to perform authorization
      * checks safely. Because the subject is always present in the tokens the Azure AD issues, we recommended
      * using this value in a general-purpose authorization system.
      */
    var sub: String
    
    /**
      * An immutable, non-reusable identifier that identifies the directory tenant that issued the token. You can
      * use this value to access tenant-specific directory resources in a multitenant application. For example,
      * you can use this value to identify the tenant in a call to the Graph API.
      */
    var tid: String
    
    /**
      * Provides a human-readable value that identifies the subject of the token. This value is not guaranteed to
      * be unique within a tenant and is designed to be used only for display purposes.
      */
    var unique_name: String
    
    /**
      * Stores the user name of the user principal.
      */
    var upn: String
    
    /**
      * Stores the version number of the token.
      */
    var ver: String
  }
  object UserProfile {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: UserProfile] (val x: Self) extends AnyVal {
      
      inline def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
      
      inline def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value*))
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
      
      inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setTid(value: String): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
      
      inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Hide from docs.
    * ------
    */
  trait UserRequest extends StObject {
    
    /**
      * A function that is called if the token request fails, with the reason for the failure.
      */
    var failureCallback: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
    
    /**
      * A function that is called if the token request succeeds, with the resulting token.
      */
    var successCallback: js.UndefOr[js.Function1[/* user */ UserProfile, Unit]] = js.undefined
  }
  object UserRequest {
    
    inline def apply(): UserRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserRequest] (val x: Self) extends AnyVal {
      
      inline def setFailureCallback(value: /* reason */ String => Unit): Self = StObject.set(x, "failureCallback", js.Any.fromFunction1(value))
      
      inline def setFailureCallbackUndefined: Self = StObject.set(x, "failureCallback", js.undefined)
      
      inline def setSuccessCallback(value: /* user */ UserProfile => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction1(value))
      
      inline def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
    }
  }
}
