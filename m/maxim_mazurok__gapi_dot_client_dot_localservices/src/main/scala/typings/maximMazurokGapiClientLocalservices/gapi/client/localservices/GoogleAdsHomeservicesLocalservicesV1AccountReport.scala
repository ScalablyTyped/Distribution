package typings.maximMazurokGapiClientLocalservices.gapi.client.localservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAdsHomeservicesLocalservicesV1AccountReport extends js.Object {
  
  /** Unique identifier of the GLS account. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Aggregator specific information related to the account. */
  var aggregatorInfo: js.UndefOr[GoogleAdsHomeservicesLocalservicesV1AggregatorInfo] = js.native
  
  /** Average review rating score from 1-5 stars. */
  var averageFiveStarRating: js.UndefOr[Double] = js.native
  
  /** Average weekly budget in the currency code of the account. */
  var averageWeeklyBudget: js.UndefOr[Double] = js.native
  
  /** Business name of the account. */
  var businessName: js.UndefOr[String] = js.native
  
  /** Currency code of the account. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** Number of charged leads the account received in current specified period. */
  var currentPeriodChargedLeads: js.UndefOr[String] = js.native
  
  /** Number of connected phone calls (duration over 30s) in current specified period. */
  var currentPeriodConnectedPhoneCalls: js.UndefOr[String] = js.native
  
  /** Number of phone calls in current specified period, including both connected and unconnected calls. */
  var currentPeriodPhoneCalls: js.UndefOr[String] = js.native
  
  /** Total cost of the account in current specified period in the account's specified currency. */
  var currentPeriodTotalCost: js.UndefOr[Double] = js.native
  
  /**
    * Phone lead responsiveness of the account for the past 90 days from current date. This is computed by taking the total number of connected calls from charged phone leads and dividing
    * by the total number of calls received.
    */
  var phoneLeadResponsiveness: js.UndefOr[Double] = js.native
  
  /** Number of charged leads the account received in previous specified period. */
  var previousPeriodChargedLeads: js.UndefOr[String] = js.native
  
  /** Number of connected phone calls (duration over 30s) in previous specified period. */
  var previousPeriodConnectedPhoneCalls: js.UndefOr[String] = js.native
  
  /** Number of phone calls in previous specified period, including both connected and unconnected calls. */
  var previousPeriodPhoneCalls: js.UndefOr[String] = js.native
  
  /** Total cost of the account in previous specified period in the account's specified currency. */
  var previousPeriodTotalCost: js.UndefOr[Double] = js.native
  
  /** Total number of reviews the account has up to current date. */
  var totalReview: js.UndefOr[Double] = js.native
}
object GoogleAdsHomeservicesLocalservicesV1AccountReport {
  
  @scala.inline
  def apply(): GoogleAdsHomeservicesLocalservicesV1AccountReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1AccountReport]
  }
  
  @scala.inline
  implicit class GoogleAdsHomeservicesLocalservicesV1AccountReportOps[Self <: GoogleAdsHomeservicesLocalservicesV1AccountReport] (val x: Self) extends AnyVal {
    
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
    def setAverageFiveStarRating(value: Double): Self = this.set("averageFiveStarRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageFiveStarRating: Self = this.set("averageFiveStarRating", js.undefined)
    
    @scala.inline
    def setAverageWeeklyBudget(value: Double): Self = this.set("averageWeeklyBudget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageWeeklyBudget: Self = this.set("averageWeeklyBudget", js.undefined)
    
    @scala.inline
    def setBusinessName(value: String): Self = this.set("businessName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessName: Self = this.set("businessName", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setCurrentPeriodChargedLeads(value: String): Self = this.set("currentPeriodChargedLeads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPeriodChargedLeads: Self = this.set("currentPeriodChargedLeads", js.undefined)
    
    @scala.inline
    def setCurrentPeriodConnectedPhoneCalls(value: String): Self = this.set("currentPeriodConnectedPhoneCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPeriodConnectedPhoneCalls: Self = this.set("currentPeriodConnectedPhoneCalls", js.undefined)
    
    @scala.inline
    def setCurrentPeriodPhoneCalls(value: String): Self = this.set("currentPeriodPhoneCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPeriodPhoneCalls: Self = this.set("currentPeriodPhoneCalls", js.undefined)
    
    @scala.inline
    def setCurrentPeriodTotalCost(value: Double): Self = this.set("currentPeriodTotalCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPeriodTotalCost: Self = this.set("currentPeriodTotalCost", js.undefined)
    
    @scala.inline
    def setPhoneLeadResponsiveness(value: Double): Self = this.set("phoneLeadResponsiveness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneLeadResponsiveness: Self = this.set("phoneLeadResponsiveness", js.undefined)
    
    @scala.inline
    def setPreviousPeriodChargedLeads(value: String): Self = this.set("previousPeriodChargedLeads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousPeriodChargedLeads: Self = this.set("previousPeriodChargedLeads", js.undefined)
    
    @scala.inline
    def setPreviousPeriodConnectedPhoneCalls(value: String): Self = this.set("previousPeriodConnectedPhoneCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousPeriodConnectedPhoneCalls: Self = this.set("previousPeriodConnectedPhoneCalls", js.undefined)
    
    @scala.inline
    def setPreviousPeriodPhoneCalls(value: String): Self = this.set("previousPeriodPhoneCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousPeriodPhoneCalls: Self = this.set("previousPeriodPhoneCalls", js.undefined)
    
    @scala.inline
    def setPreviousPeriodTotalCost(value: Double): Self = this.set("previousPeriodTotalCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousPeriodTotalCost: Self = this.set("previousPeriodTotalCost", js.undefined)
    
    @scala.inline
    def setTotalReview(value: Double): Self = this.set("totalReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalReview: Self = this.set("totalReview", js.undefined)
  }
}
