package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingGetGithubPackagesBillingUserResponseData extends js.Object {
  /**
    * Free storage space (GB) for GitHub Packages.
    */
  var included_gigabytes_bandwidth: Double = js.native
  /**
    * Sum of the free and paid storage space (GB) for GitHuub Packages.
    */
  var total_gigabytes_bandwidth_used: Double = js.native
  /**
    * Total paid storage space (GB) for GitHuub Packages.
    */
  var total_paid_gigabytes_bandwidth_used: Double = js.native
}

object BillingGetGithubPackagesBillingUserResponseData {
  @scala.inline
  def apply(
    included_gigabytes_bandwidth: Double,
    total_gigabytes_bandwidth_used: Double,
    total_paid_gigabytes_bandwidth_used: Double
  ): BillingGetGithubPackagesBillingUserResponseData = {
    val __obj = js.Dynamic.literal(included_gigabytes_bandwidth = included_gigabytes_bandwidth.asInstanceOf[js.Any], total_gigabytes_bandwidth_used = total_gigabytes_bandwidth_used.asInstanceOf[js.Any], total_paid_gigabytes_bandwidth_used = total_paid_gigabytes_bandwidth_used.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetGithubPackagesBillingUserResponseData]
  }
  @scala.inline
  implicit class BillingGetGithubPackagesBillingUserResponseDataOps[Self <: BillingGetGithubPackagesBillingUserResponseData] (val x: Self) extends AnyVal {
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
    def setIncluded_gigabytes_bandwidth(value: Double): Self = this.set("included_gigabytes_bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_gigabytes_bandwidth_used(value: Double): Self = this.set("total_gigabytes_bandwidth_used", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_paid_gigabytes_bandwidth_used(value: Double): Self = this.set("total_paid_gigabytes_bandwidth_used", value.asInstanceOf[js.Any])
  }
  
}

