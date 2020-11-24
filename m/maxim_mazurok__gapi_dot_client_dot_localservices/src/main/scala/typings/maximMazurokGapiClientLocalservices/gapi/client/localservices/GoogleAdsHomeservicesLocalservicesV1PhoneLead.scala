package typings.maximMazurokGapiClientLocalservices.gapi.client.localservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAdsHomeservicesLocalservicesV1PhoneLead extends js.Object {
  
  /** Timestamp of the phone call which resulted in a charged phone lead. */
  var chargedCallTimestamp: js.UndefOr[String] = js.native
  
  /** Duration of the charged phone call in seconds. */
  var chargedConnectedCallDurationSeconds: js.UndefOr[String] = js.native
  
  /** Consumer phone number associated with the phone lead. */
  var consumerPhoneNumber: js.UndefOr[String] = js.native
}
object GoogleAdsHomeservicesLocalservicesV1PhoneLead {
  
  @scala.inline
  def apply(): GoogleAdsHomeservicesLocalservicesV1PhoneLead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1PhoneLead]
  }
  
  @scala.inline
  implicit class GoogleAdsHomeservicesLocalservicesV1PhoneLeadOps[Self <: GoogleAdsHomeservicesLocalservicesV1PhoneLead] (val x: Self) extends AnyVal {
    
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
    def setChargedCallTimestamp(value: String): Self = this.set("chargedCallTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargedCallTimestamp: Self = this.set("chargedCallTimestamp", js.undefined)
    
    @scala.inline
    def setChargedConnectedCallDurationSeconds(value: String): Self = this.set("chargedConnectedCallDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargedConnectedCallDurationSeconds: Self = this.set("chargedConnectedCallDurationSeconds", js.undefined)
    
    @scala.inline
    def setConsumerPhoneNumber(value: String): Self = this.set("consumerPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerPhoneNumber: Self = this.set("consumerPhoneNumber", js.undefined)
  }
}
