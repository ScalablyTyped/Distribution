package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.WINDOWS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingGetGithubActionsBillingOrgResponseData extends js.Object {
  /**
    * The amount of free GitHub Actions minutes available.
    */
  var included_minutes: Double = js.native
  var minutes_used_breakdown: WINDOWS = js.native
  /**
    * The sum of the free and paid GitHub Actions minutes used.
    */
  var total_minutes_used: Double = js.native
  /**
    * The total paid GitHub Actions minutes used.
    */
  var total_paid_minutes_used: Double = js.native
}

object BillingGetGithubActionsBillingOrgResponseData {
  @scala.inline
  def apply(
    included_minutes: Double,
    minutes_used_breakdown: WINDOWS,
    total_minutes_used: Double,
    total_paid_minutes_used: Double
  ): BillingGetGithubActionsBillingOrgResponseData = {
    val __obj = js.Dynamic.literal(included_minutes = included_minutes.asInstanceOf[js.Any], minutes_used_breakdown = minutes_used_breakdown.asInstanceOf[js.Any], total_minutes_used = total_minutes_used.asInstanceOf[js.Any], total_paid_minutes_used = total_paid_minutes_used.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetGithubActionsBillingOrgResponseData]
  }
  @scala.inline
  implicit class BillingGetGithubActionsBillingOrgResponseDataOps[Self <: BillingGetGithubActionsBillingOrgResponseData] (val x: Self) extends AnyVal {
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
    def setIncluded_minutes(value: Double): Self = this.set("included_minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinutes_used_breakdown(value: WINDOWS): Self = this.set("minutes_used_breakdown", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_minutes_used(value: Double): Self = this.set("total_minutes_used", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_paid_minutes_used(value: Double): Self = this.set("total_paid_minutes_used", value.asInstanceOf[js.Any])
  }
  
}

