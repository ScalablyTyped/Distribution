package typings.maximMazurokGapiClientFile.gapi.client.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility extends js.Object {
  
  /** Whether an instance is eligible or ineligible. */
  var eligible: js.UndefOr[Boolean] = js.native
  
  /** User-defined reason for the current value of instance eligibility. Usually, this can be directly mapped to the internal state. An empty reason is allowed. */
  var reason: js.UndefOr[String] = js.native
}
object GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1SloEligibilityOps[Self <: GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility] (val x: Self) extends AnyVal {
    
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
    def setEligible(value: Boolean): Self = this.set("eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligible: Self = this.set("eligible", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
