package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IapCredential extends js.Object {
  
  /** Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies. */
  var iapTestServiceAccountInfo: js.UndefOr[IapTestServiceAccountInfo] = js.native
}
object IapCredential {
  
  @scala.inline
  def apply(): IapCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IapCredential]
  }
  
  @scala.inline
  implicit class IapCredentialOps[Self <: IapCredential] (val x: Self) extends AnyVal {
    
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
    def setIapTestServiceAccountInfo(value: IapTestServiceAccountInfo): Self = this.set("iapTestServiceAccountInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIapTestServiceAccountInfo: Self = this.set("iapTestServiceAccountInfo", js.undefined)
  }
}
