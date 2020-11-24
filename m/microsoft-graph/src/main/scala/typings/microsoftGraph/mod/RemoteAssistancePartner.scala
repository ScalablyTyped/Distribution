package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteAssistancePartner extends Entity {
  
  // Display name of the partner.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Timestamp of the last request sent to Intune by the TEM partner.
  var lastConnectionDateTime: js.UndefOr[String] = js.native
  
  // TBD. Possible values are: notOnboarded, onboarding, onboarded.
  var onboardingStatus: js.UndefOr[RemoteAssistanceOnboardingStatus] = js.native
  
  // URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
  var onboardingUrl: js.UndefOr[NullableOption[String]] = js.native
}
object RemoteAssistancePartner {
  
  @scala.inline
  def apply(): RemoteAssistancePartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAssistancePartner]
  }
  
  @scala.inline
  implicit class RemoteAssistancePartnerOps[Self <: RemoteAssistancePartner] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setLastConnectionDateTime(value: String): Self = this.set("lastConnectionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastConnectionDateTime: Self = this.set("lastConnectionDateTime", js.undefined)
    
    @scala.inline
    def setOnboardingStatus(value: RemoteAssistanceOnboardingStatus): Self = this.set("onboardingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnboardingStatus: Self = this.set("onboardingStatus", js.undefined)
    
    @scala.inline
    def setOnboardingUrl(value: NullableOption[String]): Self = this.set("onboardingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnboardingUrl: Self = this.set("onboardingUrl", js.undefined)
    
    @scala.inline
    def setOnboardingUrlNull: Self = this.set("onboardingUrl", null)
  }
}
