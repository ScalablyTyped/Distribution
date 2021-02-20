package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthSettings extends StObject {
  
  /**
    * Domain hint to send as hd=? parameter in OAuth request flow. Enables redirect to primary IDP by skipping Google's login screen.
    * https://developers.google.com/identity/protocols/OpenIDConnect#hd-param Note: IAP does not verify that the id token's hd claim matches this value since access behavior is managed by
    * IAM policies.
    */
  var loginHint: js.UndefOr[String] = js.native
}
object OAuthSettings {
  
  @scala.inline
  def apply(): OAuthSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthSettings]
  }
  
  @scala.inline
  implicit class OAuthSettingsMutableBuilder[Self <: OAuthSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
  }
}
