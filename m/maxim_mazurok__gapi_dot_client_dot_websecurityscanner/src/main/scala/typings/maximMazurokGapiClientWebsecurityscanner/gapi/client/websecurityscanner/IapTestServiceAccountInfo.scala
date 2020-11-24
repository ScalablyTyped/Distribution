package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IapTestServiceAccountInfo extends js.Object {
  
  /** Required. Describes OAuth2 client id of resources protected by Identity-Aware-Proxy (IAP). */
  var targetAudienceClientId: js.UndefOr[String] = js.native
}
object IapTestServiceAccountInfo {
  
  @scala.inline
  def apply(): IapTestServiceAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IapTestServiceAccountInfo]
  }
  
  @scala.inline
  implicit class IapTestServiceAccountInfoOps[Self <: IapTestServiceAccountInfo] (val x: Self) extends AnyVal {
    
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
    def setTargetAudienceClientId(value: String): Self = this.set("targetAudienceClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetAudienceClientId: Self = this.set("targetAudienceClientId", js.undefined)
  }
}
