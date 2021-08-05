package typings.oauth2Server.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenOptions extends StObject {
  
  /**
    * Lifetime of generated access tokens in seconds (default = 1 hour)
    */
  var accessTokenLifetime: js.UndefOr[Double] = js.undefined
  
  /**
    * Allow extended attributes to be set on the returned token
    */
  var allowExtendedTokenAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Always revoke the used refresh token and issue a new one for the refresh_token grant.
    */
  var alwaysIssueNewRefreshToken: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional supported grant types.
    */
  var extendedGrantTypes: js.UndefOr[StringDictionary[Instantiable1[/* options */ TokenOptions, AbstractGrantType]]] = js.undefined
  
  /**
    * Lifetime of generated refresh tokens in seconds (default = 2 weeks)
    */
  var refreshTokenLifetime: js.UndefOr[Double] = js.undefined
  
  /**
    * Require a client secret. Defaults to true for all grant types.
    */
  var requireClientAuthentication: js.UndefOr[js.Object] = js.undefined
}
object TokenOptions {
  
  inline def apply(): TokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenOptions]
  }
  
  extension [Self <: TokenOptions](x: Self) {
    
    inline def setAccessTokenLifetime(value: Double): Self = StObject.set(x, "accessTokenLifetime", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenLifetimeUndefined: Self = StObject.set(x, "accessTokenLifetime", js.undefined)
    
    inline def setAllowExtendedTokenAttributes(value: Boolean): Self = StObject.set(x, "allowExtendedTokenAttributes", value.asInstanceOf[js.Any])
    
    inline def setAllowExtendedTokenAttributesUndefined: Self = StObject.set(x, "allowExtendedTokenAttributes", js.undefined)
    
    inline def setAlwaysIssueNewRefreshToken(value: Boolean): Self = StObject.set(x, "alwaysIssueNewRefreshToken", value.asInstanceOf[js.Any])
    
    inline def setAlwaysIssueNewRefreshTokenUndefined: Self = StObject.set(x, "alwaysIssueNewRefreshToken", js.undefined)
    
    inline def setExtendedGrantTypes(value: StringDictionary[Instantiable1[/* options */ TokenOptions, AbstractGrantType]]): Self = StObject.set(x, "extendedGrantTypes", value.asInstanceOf[js.Any])
    
    inline def setExtendedGrantTypesUndefined: Self = StObject.set(x, "extendedGrantTypes", js.undefined)
    
    inline def setRefreshTokenLifetime(value: Double): Self = StObject.set(x, "refreshTokenLifetime", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenLifetimeUndefined: Self = StObject.set(x, "refreshTokenLifetime", js.undefined)
    
    inline def setRequireClientAuthentication(value: js.Object): Self = StObject.set(x, "requireClientAuthentication", value.asInstanceOf[js.Any])
    
    inline def setRequireClientAuthenticationUndefined: Self = StObject.set(x, "requireClientAuthentication", js.undefined)
  }
}
