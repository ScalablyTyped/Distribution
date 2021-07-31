package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InformationalUrl extends StObject {
  
  // CDN URL to the application's logo, Read-only.
  var logoUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Link to the application's marketing page. For example, https://www.contoso.com/app/marketing
  var marketingUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Link to the application's privacy statement. For example, https://www.contoso.com/app/privacy
  var privacyStatementUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Link to the application's support page. For example, https://www.contoso.com/app/support
  var supportUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Link to the application's terms of service statement. For example, https://www.contoso.com/app/termsofservice
  var termsOfServiceUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object InformationalUrl {
  
  @scala.inline
  def apply(): InformationalUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InformationalUrl]
  }
  
  @scala.inline
  implicit class InformationalUrlMutableBuilder[Self <: InformationalUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogoUrl(value: NullableOption[String]): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUrlNull: Self = StObject.set(x, "logoUrl", null)
    
    @scala.inline
    def setLogoUrlUndefined: Self = StObject.set(x, "logoUrl", js.undefined)
    
    @scala.inline
    def setMarketingUrl(value: NullableOption[String]): Self = StObject.set(x, "marketingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketingUrlNull: Self = StObject.set(x, "marketingUrl", null)
    
    @scala.inline
    def setMarketingUrlUndefined: Self = StObject.set(x, "marketingUrl", js.undefined)
    
    @scala.inline
    def setPrivacyStatementUrl(value: NullableOption[String]): Self = StObject.set(x, "privacyStatementUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyStatementUrlNull: Self = StObject.set(x, "privacyStatementUrl", null)
    
    @scala.inline
    def setPrivacyStatementUrlUndefined: Self = StObject.set(x, "privacyStatementUrl", js.undefined)
    
    @scala.inline
    def setSupportUrl(value: NullableOption[String]): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUrlNull: Self = StObject.set(x, "supportUrl", null)
    
    @scala.inline
    def setSupportUrlUndefined: Self = StObject.set(x, "supportUrl", js.undefined)
    
    @scala.inline
    def setTermsOfServiceUrl(value: NullableOption[String]): Self = StObject.set(x, "termsOfServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsOfServiceUrlNull: Self = StObject.set(x, "termsOfServiceUrl", null)
    
    @scala.inline
    def setTermsOfServiceUrlUndefined: Self = StObject.set(x, "termsOfServiceUrl", js.undefined)
  }
}
