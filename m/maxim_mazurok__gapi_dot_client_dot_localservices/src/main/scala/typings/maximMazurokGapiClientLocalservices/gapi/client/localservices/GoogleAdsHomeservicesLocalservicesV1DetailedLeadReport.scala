package typings.maximMazurokGapiClientLocalservices.gapi.client.localservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport extends js.Object {
  
  /** Identifies account that received the lead. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Aggregator specific information related to the lead. */
  var aggregatorInfo: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1AggregatorInfo] = js.native
  
  /** Business name associated to the account. */
  var businessName: js.UndefOr[String] = js.native
  
  /** Whether the lead has been charged. */
  var chargeStatus: js.UndefOr[String] = js.native
  
  /** Currency code. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** Dispute status related to the lead. */
  var disputeStatus: js.UndefOr[String] = js.native
  
  /** Location of the associated account's home city. */
  var geo: js.UndefOr[String] = js.native
  
  /** Lead category (e.g. hvac, plumber) */
  var leadCategory: js.UndefOr[String] = js.native
  
  /** Timestamp of when the lead was created. */
  var leadCreationTimestamp: js.UndefOr[String] = js.native
  
  /** Unique identifier of a Detailed Lead Report. */
  var leadId: js.UndefOr[String] = js.native
  
  /** Price of the lead (available only after it has been charged). */
  var leadPrice: js.UndefOr[Double] = js.native
  
  /** Lead type. */
  var leadType: js.UndefOr[String] = js.native
  
  /** More information associated to only message leads. */
  var messageLead: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1MessageLead] = js.native
  
  /** More information associated to only phone leads. */
  var phoneLead: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1PhoneLead] = js.native
  
  /** Timezone of the particular provider associated to a lead. */
  var timezone: js.UndefOr[GoogleTypeTimeZone] = js.native
}
object GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport {
  
  @scala.inline
  def apply(): GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]
  }
  
  @scala.inline
  implicit class GoogleAdsHomeservicesLocalservicesV1DetailedLeadReportOps[Self <: GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAggregatorInfo(value: GoogleAdsHomeservicesLocalservicesV1AggregatorInfo): Self = this.set("aggregatorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregatorInfo: Self = this.set("aggregatorInfo", js.undefined)
    
    @scala.inline
    def setBusinessName(value: String): Self = this.set("businessName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessName: Self = this.set("businessName", js.undefined)
    
    @scala.inline
    def setChargeStatus(value: String): Self = this.set("chargeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargeStatus: Self = this.set("chargeStatus", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setDisputeStatus(value: String): Self = this.set("disputeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisputeStatus: Self = this.set("disputeStatus", js.undefined)
    
    @scala.inline
    def setGeo(value: String): Self = this.set("geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeo: Self = this.set("geo", js.undefined)
    
    @scala.inline
    def setLeadCategory(value: String): Self = this.set("leadCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadCategory: Self = this.set("leadCategory", js.undefined)
    
    @scala.inline
    def setLeadCreationTimestamp(value: String): Self = this.set("leadCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadCreationTimestamp: Self = this.set("leadCreationTimestamp", js.undefined)
    
    @scala.inline
    def setLeadId(value: String): Self = this.set("leadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadId: Self = this.set("leadId", js.undefined)
    
    @scala.inline
    def setLeadPrice(value: Double): Self = this.set("leadPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadPrice: Self = this.set("leadPrice", js.undefined)
    
    @scala.inline
    def setLeadType(value: String): Self = this.set("leadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadType: Self = this.set("leadType", js.undefined)
    
    @scala.inline
    def setMessageLead(value: GoogleAdsHomeservicesLocalservicesV1MessageLead): Self = this.set("messageLead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageLead: Self = this.set("messageLead", js.undefined)
    
    @scala.inline
    def setPhoneLead(value: GoogleAdsHomeservicesLocalservicesV1PhoneLead): Self = this.set("phoneLead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneLead: Self = this.set("phoneLead", js.undefined)
    
    @scala.inline
    def setTimezone(value: GoogleTypeTimeZone): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
}
