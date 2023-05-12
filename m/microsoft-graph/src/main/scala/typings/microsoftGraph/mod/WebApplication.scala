package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApplication extends StObject {
  
  // Home page or landing page of the application.
  var homePageUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow.
  var implicitGrantSettings: js.UndefOr[NullableOption[ImplicitGrantSettings]] = js.undefined
  
  /**
    * Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel,
    * back-channel or SAML logout protocols.
    */
  var logoutUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var redirectUriSettings: js.UndefOr[js.Array[RedirectUriSettings]] = js.undefined
  
  /**
    * Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and
    * access tokens are sent.
    */
  var redirectUris: js.UndefOr[js.Array[String]] = js.undefined
}
object WebApplication {
  
  inline def apply(): WebApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebApplication] (val x: Self) extends AnyVal {
    
    inline def setHomePageUrl(value: NullableOption[String]): Self = StObject.set(x, "homePageUrl", value.asInstanceOf[js.Any])
    
    inline def setHomePageUrlNull: Self = StObject.set(x, "homePageUrl", null)
    
    inline def setHomePageUrlUndefined: Self = StObject.set(x, "homePageUrl", js.undefined)
    
    inline def setImplicitGrantSettings(value: NullableOption[ImplicitGrantSettings]): Self = StObject.set(x, "implicitGrantSettings", value.asInstanceOf[js.Any])
    
    inline def setImplicitGrantSettingsNull: Self = StObject.set(x, "implicitGrantSettings", null)
    
    inline def setImplicitGrantSettingsUndefined: Self = StObject.set(x, "implicitGrantSettings", js.undefined)
    
    inline def setLogoutUrl(value: NullableOption[String]): Self = StObject.set(x, "logoutUrl", value.asInstanceOf[js.Any])
    
    inline def setLogoutUrlNull: Self = StObject.set(x, "logoutUrl", null)
    
    inline def setLogoutUrlUndefined: Self = StObject.set(x, "logoutUrl", js.undefined)
    
    inline def setRedirectUriSettings(value: js.Array[RedirectUriSettings]): Self = StObject.set(x, "redirectUriSettings", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriSettingsUndefined: Self = StObject.set(x, "redirectUriSettings", js.undefined)
    
    inline def setRedirectUriSettingsVarargs(value: RedirectUriSettings*): Self = StObject.set(x, "redirectUriSettings", js.Array(value*))
    
    inline def setRedirectUris(value: js.Array[String]): Self = StObject.set(x, "redirectUris", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrisUndefined: Self = StObject.set(x, "redirectUris", js.undefined)
    
    inline def setRedirectUrisVarargs(value: String*): Self = StObject.set(x, "redirectUris", js.Array(value*))
  }
}
