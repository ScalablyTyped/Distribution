package typings.npmRegistryFetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<npm-registry-fetch.npm-registry-fetch.AuthOptions> */
  trait PartialAuthOptions extends StObject {
    
    var _auth: js.UndefOr[String] = js.undefined
    
    var _authToken: js.UndefOr[String] = js.undefined
    
    var _password: js.UndefOr[String] = js.undefined
    
    var `always-auth`: js.UndefOr[Boolean] = js.undefined
    
    var alwaysAuth: js.UndefOr[Boolean] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var otp: js.UndefOr[Double | String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object PartialAuthOptions {
    
    inline def apply(): PartialAuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAuthOptions]
    }
    
    extension [Self <: PartialAuthOptions](x: Self) {
      
      inline def `setAlways-auth`(value: Boolean): Self = StObject.set(x, "always-auth", value.asInstanceOf[js.Any])
      
      inline def `setAlways-authUndefined`: Self = StObject.set(x, "always-auth", js.undefined)
      
      inline def setAlwaysAuth(value: Boolean): Self = StObject.set(x, "alwaysAuth", value.asInstanceOf[js.Any])
      
      inline def setAlwaysAuthUndefined: Self = StObject.set(x, "alwaysAuth", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setOtp(value: Double | String): Self = StObject.set(x, "otp", value.asInstanceOf[js.Any])
      
      inline def setOtpUndefined: Self = StObject.set(x, "otp", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def set_auth(value: String): Self = StObject.set(x, "_auth", value.asInstanceOf[js.Any])
      
      inline def set_authToken(value: String): Self = StObject.set(x, "_authToken", value.asInstanceOf[js.Any])
      
      inline def set_authTokenUndefined: Self = StObject.set(x, "_authToken", js.undefined)
      
      inline def set_authUndefined: Self = StObject.set(x, "_auth", js.undefined)
      
      inline def set_password(value: String): Self = StObject.set(x, "_password", value.asInstanceOf[js.Any])
      
      inline def set_passwordUndefined: Self = StObject.set(x, "_password", js.undefined)
    }
  }
  
  /* Inlined std.Partial<npm-registry-fetch.npm-registry-fetch.FetchRetryOptions> */
  trait PartialFetchRetryOptions extends StObject {
    
    var fetchRetries: js.UndefOr[Double] = js.undefined
    
    var fetchRetryFactor: js.UndefOr[Double] = js.undefined
    
    var fetchRetryMaxtimeout: js.UndefOr[Double] = js.undefined
    
    var fetchRetryMintimeout: js.UndefOr[Double] = js.undefined
  }
  object PartialFetchRetryOptions {
    
    inline def apply(): PartialFetchRetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFetchRetryOptions]
    }
    
    extension [Self <: PartialFetchRetryOptions](x: Self) {
      
      inline def setFetchRetries(value: Double): Self = StObject.set(x, "fetchRetries", value.asInstanceOf[js.Any])
      
      inline def setFetchRetriesUndefined: Self = StObject.set(x, "fetchRetries", js.undefined)
      
      inline def setFetchRetryFactor(value: Double): Self = StObject.set(x, "fetchRetryFactor", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryFactorUndefined: Self = StObject.set(x, "fetchRetryFactor", js.undefined)
      
      inline def setFetchRetryMaxtimeout(value: Double): Self = StObject.set(x, "fetchRetryMaxtimeout", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryMaxtimeoutUndefined: Self = StObject.set(x, "fetchRetryMaxtimeout", js.undefined)
      
      inline def setFetchRetryMintimeout(value: Double): Self = StObject.set(x, "fetchRetryMintimeout", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryMintimeoutUndefined: Self = StObject.set(x, "fetchRetryMintimeout", js.undefined)
    }
  }
}
