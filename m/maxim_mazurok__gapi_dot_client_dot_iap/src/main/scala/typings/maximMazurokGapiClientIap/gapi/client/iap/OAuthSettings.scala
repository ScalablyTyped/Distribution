package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthSettings extends StObject {
  
  /**
    * Domain hint to send as hd=? parameter in OAuth request flow. Enables redirect to primary IDP by skipping Google's login screen.
    * https://developers.google.com/identity/protocols/OpenIDConnect#hd-param Note: IAP does not verify that the id token's hd claim matches this value since access behavior is managed by
    * IAM policies.
    */
  var loginHint: js.UndefOr[String] = js.undefined
}
object OAuthSettings {
  
  inline def apply(): OAuthSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthSettings]
  }
  
  extension [Self <: OAuthSettings](x: Self) {
    
    inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
    
    inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
  }
}
