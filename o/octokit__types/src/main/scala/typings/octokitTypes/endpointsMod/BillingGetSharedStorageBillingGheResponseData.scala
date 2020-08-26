package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingGetSharedStorageBillingGheResponseData extends js.Object {
  /**
    * Numbers of days left in billing cycle.
    */
  var days_left_in_billing_cycle: Double = js.native
  /**
    * Estimated storage space (GB) used in billing cycle.
    */
  var estimated_paid_storage_for_month: Double = js.native
  /**
    * Estimated sum of free and paid storage space (GB) used in billing cycle.
    */
  var estimated_storage_for_month: Double = js.native
}

object BillingGetSharedStorageBillingGheResponseData {
  @scala.inline
  def apply(
    days_left_in_billing_cycle: Double,
    estimated_paid_storage_for_month: Double,
    estimated_storage_for_month: Double
  ): BillingGetSharedStorageBillingGheResponseData = {
    val __obj = js.Dynamic.literal(days_left_in_billing_cycle = days_left_in_billing_cycle.asInstanceOf[js.Any], estimated_paid_storage_for_month = estimated_paid_storage_for_month.asInstanceOf[js.Any], estimated_storage_for_month = estimated_storage_for_month.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetSharedStorageBillingGheResponseData]
  }
  @scala.inline
  implicit class BillingGetSharedStorageBillingGheResponseDataOps[Self <: BillingGetSharedStorageBillingGheResponseData] (val x: Self) extends AnyVal {
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
    def setDays_left_in_billing_cycle(value: Double): Self = this.set("days_left_in_billing_cycle", value.asInstanceOf[js.Any])
    @scala.inline
    def setEstimated_paid_storage_for_month(value: Double): Self = this.set("estimated_paid_storage_for_month", value.asInstanceOf[js.Any])
    @scala.inline
    def setEstimated_storage_for_month(value: Double): Self = this.set("estimated_storage_for_month", value.asInstanceOf[js.Any])
  }
  
}

