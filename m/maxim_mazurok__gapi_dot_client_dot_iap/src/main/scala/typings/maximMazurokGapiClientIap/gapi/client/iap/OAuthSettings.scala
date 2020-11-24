package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthSettings extends js.Object {
  
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
  implicit class OAuthSettingsOps[Self <: OAuthSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoginHint(value: String): Self = this.set("loginHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginHint: Self = this.set("loginHint", js.undefined)
  }
}
