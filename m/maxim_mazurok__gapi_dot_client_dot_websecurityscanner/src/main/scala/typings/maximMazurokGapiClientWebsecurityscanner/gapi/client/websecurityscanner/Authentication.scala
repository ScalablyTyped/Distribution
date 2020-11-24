package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authentication extends js.Object {
  
  /** Authentication using a custom account. */
  var customAccount: js.UndefOr[CustomAccount] = js.native
  
  /** Authentication using a Google account. */
  var googleAccount: js.UndefOr[GoogleAccount] = js.native
  
  /** Authentication using Identity-Aware-Proxy (IAP). */
  var iapCredential: js.UndefOr[IapCredential] = js.native
}
object Authentication {
  
  @scala.inline
  def apply(): Authentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authentication]
  }
  
  @scala.inline
  implicit class AuthenticationOps[Self <: Authentication] (val x: Self) extends AnyVal {
    
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
    def setCustomAccount(value: CustomAccount): Self = this.set("customAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAccount: Self = this.set("customAccount", js.undefined)
    
    @scala.inline
    def setGoogleAccount(value: GoogleAccount): Self = this.set("googleAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAccount: Self = this.set("googleAccount", js.undefined)
    
    @scala.inline
    def setIapCredential(value: IapCredential): Self = this.set("iapCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIapCredential: Self = this.set("iapCredential", js.undefined)
  }
}
