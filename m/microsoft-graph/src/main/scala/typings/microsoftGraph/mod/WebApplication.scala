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
  
  /**
    * Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and
    * access tokens are sent.
    */
  var redirectUris: js.UndefOr[js.Array[String]] = js.undefined
}
object WebApplication {
  
  @scala.inline
  def apply(): WebApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebApplication]
  }
  
  @scala.inline
  implicit class WebApplicationMutableBuilder[Self <: WebApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomePageUrl(value: NullableOption[String]): Self = StObject.set(x, "homePageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePageUrlNull: Self = StObject.set(x, "homePageUrl", null)
    
    @scala.inline
    def setHomePageUrlUndefined: Self = StObject.set(x, "homePageUrl", js.undefined)
    
    @scala.inline
    def setImplicitGrantSettings(value: NullableOption[ImplicitGrantSettings]): Self = StObject.set(x, "implicitGrantSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitGrantSettingsNull: Self = StObject.set(x, "implicitGrantSettings", null)
    
    @scala.inline
    def setImplicitGrantSettingsUndefined: Self = StObject.set(x, "implicitGrantSettings", js.undefined)
    
    @scala.inline
    def setLogoutUrl(value: NullableOption[String]): Self = StObject.set(x, "logoutUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoutUrlNull: Self = StObject.set(x, "logoutUrl", null)
    
    @scala.inline
    def setLogoutUrlUndefined: Self = StObject.set(x, "logoutUrl", js.undefined)
    
    @scala.inline
    def setRedirectUris(value: js.Array[String]): Self = StObject.set(x, "redirectUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrisUndefined: Self = StObject.set(x, "redirectUris", js.undefined)
    
    @scala.inline
    def setRedirectUrisVarargs(value: String*): Self = StObject.set(x, "redirectUris", js.Array(value :_*))
  }
}
