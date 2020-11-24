package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessSettings extends js.Object {
  
  /** Configuration to allow cross-origin requests via IAP. */
  var corsSettings: js.UndefOr[CorsSettings] = js.native
  
  /** GCIP claims and endpoint configurations for 3p identity providers. */
  var gcipSettings: js.UndefOr[GcipSettings] = js.native
  
  /** Settings to configure IAP's OAuth behavior. */
  var oauthSettings: js.UndefOr[OAuthSettings] = js.native
  
  /** Settings to configure Policy delegation for apps hosted in tenant projects. INTERNAL_ONLY. */
  var policyDelegationSettings: js.UndefOr[PolicyDelegationSettings] = js.native
}
object AccessSettings {
  
  @scala.inline
  def apply(): AccessSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessSettings]
  }
  
  @scala.inline
  implicit class AccessSettingsOps[Self <: AccessSettings] (val x: Self) extends AnyVal {
    
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
    def setCorsSettings(value: CorsSettings): Self = this.set("corsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorsSettings: Self = this.set("corsSettings", js.undefined)
    
    @scala.inline
    def setGcipSettings(value: GcipSettings): Self = this.set("gcipSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcipSettings: Self = this.set("gcipSettings", js.undefined)
    
    @scala.inline
    def setOauthSettings(value: OAuthSettings): Self = this.set("oauthSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauthSettings: Self = this.set("oauthSettings", js.undefined)
    
    @scala.inline
    def setPolicyDelegationSettings(value: PolicyDelegationSettings): Self = this.set("policyDelegationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyDelegationSettings: Self = this.set("policyDelegationSettings", js.undefined)
  }
}
