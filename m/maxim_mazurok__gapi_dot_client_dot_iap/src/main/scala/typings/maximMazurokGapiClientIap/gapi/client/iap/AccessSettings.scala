package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessSettings extends StObject {
  
  /** Configuration to allow cross-origin requests via IAP. */
  var corsSettings: js.UndefOr[CorsSettings] = js.undefined
  
  /** GCIP claims and endpoint configurations for 3p identity providers. */
  var gcipSettings: js.UndefOr[GcipSettings] = js.undefined
  
  /** Settings to configure IAP's OAuth behavior. */
  var oauthSettings: js.UndefOr[OAuthSettings] = js.undefined
  
  /** Settings to configure Policy delegation for apps hosted in tenant projects. INTERNAL_ONLY. */
  var policyDelegationSettings: js.UndefOr[PolicyDelegationSettings] = js.undefined
}
object AccessSettings {
  
  @scala.inline
  def apply(): AccessSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessSettings]
  }
  
  @scala.inline
  implicit class AccessSettingsMutableBuilder[Self <: AccessSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorsSettings(value: CorsSettings): Self = StObject.set(x, "corsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsSettingsUndefined: Self = StObject.set(x, "corsSettings", js.undefined)
    
    @scala.inline
    def setGcipSettings(value: GcipSettings): Self = StObject.set(x, "gcipSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcipSettingsUndefined: Self = StObject.set(x, "gcipSettings", js.undefined)
    
    @scala.inline
    def setOauthSettings(value: OAuthSettings): Self = StObject.set(x, "oauthSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthSettingsUndefined: Self = StObject.set(x, "oauthSettings", js.undefined)
    
    @scala.inline
    def setPolicyDelegationSettings(value: PolicyDelegationSettings): Self = StObject.set(x, "policyDelegationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDelegationSettingsUndefined: Self = StObject.set(x, "policyDelegationSettings", js.undefined)
  }
}
