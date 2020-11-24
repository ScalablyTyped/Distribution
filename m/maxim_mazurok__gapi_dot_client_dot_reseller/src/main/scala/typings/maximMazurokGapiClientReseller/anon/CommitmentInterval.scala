package typings.maximMazurokGapiClientReseller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitmentInterval extends js.Object {
  
  /**
    * In this version of the API, annual commitment plan's interval is one year.  Note: When billingMethod value is OFFLINE, the subscription property object plan.commitmentInterval
    * is omitted in all API responses.
    */
  var commitmentInterval: js.UndefOr[EndTime] = js.native
  
  /**
    * The isCommitmentPlan property's boolean value identifies the plan as an annual commitment plan:
    * - true — The subscription's plan is an annual commitment plan.
    * - false — The plan is not an annual commitment plan.
    */
  var isCommitmentPlan: js.UndefOr[Boolean] = js.native
  
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
  var planName: js.UndefOr[String] = js.native
}
object CommitmentInterval {
  
  @scala.inline
  def apply(): CommitmentInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitmentInterval]
  }
  
  @scala.inline
  implicit class CommitmentIntervalOps[Self <: CommitmentInterval] (val x: Self) extends AnyVal {
    
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
    def setCommitmentInterval(value: EndTime): Self = this.set("commitmentInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitmentInterval: Self = this.set("commitmentInterval", js.undefined)
    
    @scala.inline
    def setIsCommitmentPlan(value: Boolean): Self = this.set("isCommitmentPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCommitmentPlan: Self = this.set("isCommitmentPlan", js.undefined)
    
    @scala.inline
    def setPlanName(value: String): Self = this.set("planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanName: Self = this.set("planName", js.undefined)
  }
}
