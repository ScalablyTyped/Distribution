package typings.maximMazurokGapiClientLocalservices.gapi.client.localservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAdsHomeservicesLocalservicesV1MessageLead extends js.Object {
  
  /** Consumer phone number associated with the message lead. */
  var consumerPhoneNumber: js.UndefOr[String] = js.native
  
  /** Name of the customer who created the lead. */
  var customerName: js.UndefOr[String] = js.native
  
  /** The job type of the specified lead. */
  var jobType: js.UndefOr[String] = js.native
  
  /** The postal code of the customer who created the lead. */
  var postalCode: js.UndefOr[String] = js.native
}
object GoogleAdsHomeservicesLocalservicesV1MessageLead {
  
  @scala.inline
  def apply(): GoogleAdsHomeservicesLocalservicesV1MessageLead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1MessageLead]
  }
  
  @scala.inline
  implicit class GoogleAdsHomeservicesLocalservicesV1MessageLeadOps[Self <: GoogleAdsHomeservicesLocalservicesV1MessageLead] (val x: Self) extends AnyVal {
    
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
    def setConsumerPhoneNumber(value: String): Self = this.set("consumerPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerPhoneNumber: Self = this.set("consumerPhoneNumber", js.undefined)
    
    @scala.inline
    def setCustomerName(value: String): Self = this.set("customerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerName: Self = this.set("customerName", js.undefined)
    
    @scala.inline
    def setJobType(value: String): Self = this.set("jobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobType: Self = this.set("jobType", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
  }
}
