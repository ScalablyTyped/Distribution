package typings.maximMazurokGapiClientReseller.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitmentInterval extends StObject {
  
  /**
    * In this version of the API, annual commitment plan's interval is one year.  Note: When billingMethod value is OFFLINE, the subscription property object plan.commitmentInterval
    * is omitted in all API responses.
    */
  var commitmentInterval: js.UndefOr[EndTime] = js.undefined
  
  /**
    * The isCommitmentPlan property's boolean value identifies the plan as an annual commitment plan:
    * - true — The subscription's plan is an annual commitment plan.
    * - false — The plan is not an annual commitment plan.
    */
  var isCommitmentPlan: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The planName property is required. This is the name of the subscription's plan. For more information about the Google payment plans, see the API concepts.
    *
    * Possible values are:
    * - ANNUAL_MONTHLY_PAY — The annual commitment plan with monthly payments.  Caution: ANNUAL_MONTHLY_PAY is returned as ANNUAL in all API responses.
    * - ANNUAL_YEARLY_PAY — The annual commitment plan with yearly payments
    * - FLEXIBLE — The flexible plan
    * - TRIAL — The 30-day free trial plan. A subscription in trial will be suspended after the 30th free day if no payment plan is assigned. Calling changePlan will assign a payment
    * plan to a trial but will not activate the plan. A trial will automatically begin its assigned payment plan after its 30th free day or immediately after calling startPaidService.
    *
    * - FREE — The free plan is exclusive to the Cloud Identity SKU and does not incur any billing.
    */
  var planName: js.UndefOr[String] = js.undefined
}
object CommitmentInterval {
  
  inline def apply(): CommitmentInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitmentInterval]
  }
  
  extension [Self <: CommitmentInterval](x: Self) {
    
    inline def setCommitmentInterval(value: EndTime): Self = StObject.set(x, "commitmentInterval", value.asInstanceOf[js.Any])
    
    inline def setCommitmentIntervalUndefined: Self = StObject.set(x, "commitmentInterval", js.undefined)
    
    inline def setIsCommitmentPlan(value: Boolean): Self = StObject.set(x, "isCommitmentPlan", value.asInstanceOf[js.Any])
    
    inline def setIsCommitmentPlanUndefined: Self = StObject.set(x, "isCommitmentPlan", js.undefined)
    
    inline def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
    
    inline def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
  }
}
