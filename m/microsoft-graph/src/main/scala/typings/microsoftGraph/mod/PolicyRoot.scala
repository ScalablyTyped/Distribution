package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyRoot extends Entity {
  var activityBasedTimeoutPolicies: js.UndefOr[js.Array[ActivityBasedTimeoutPolicy]] = js.native
  var claimsMappingPolicies: js.UndefOr[js.Array[ClaimsMappingPolicy]] = js.native
  var homeRealmDiscoveryPolicies: js.UndefOr[js.Array[HomeRealmDiscoveryPolicy]] = js.native
  var tokenIssuancePolicies: js.UndefOr[js.Array[TokenIssuancePolicy]] = js.native
  var tokenLifetimePolicies: js.UndefOr[js.Array[TokenLifetimePolicy]] = js.native
}

object PolicyRoot {
  @scala.inline
  def apply(): PolicyRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyRoot]
  }
  @scala.inline
  implicit class PolicyRootOps[Self <: PolicyRoot] (val x: Self) extends AnyVal {
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
    def setActivityBasedTimeoutPoliciesVarargs(value: ActivityBasedTimeoutPolicy*): Self = this.set("activityBasedTimeoutPolicies", js.Array(value :_*))
    @scala.inline
    def setActivityBasedTimeoutPolicies(value: js.Array[ActivityBasedTimeoutPolicy]): Self = this.set("activityBasedTimeoutPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityBasedTimeoutPolicies: Self = this.set("activityBasedTimeoutPolicies", js.undefined)
    @scala.inline
    def setClaimsMappingPoliciesVarargs(value: ClaimsMappingPolicy*): Self = this.set("claimsMappingPolicies", js.Array(value :_*))
    @scala.inline
    def setClaimsMappingPolicies(value: js.Array[ClaimsMappingPolicy]): Self = this.set("claimsMappingPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClaimsMappingPolicies: Self = this.set("claimsMappingPolicies", js.undefined)
    @scala.inline
    def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = this.set("homeRealmDiscoveryPolicies", js.Array(value :_*))
    @scala.inline
    def setHomeRealmDiscoveryPolicies(value: js.Array[HomeRealmDiscoveryPolicy]): Self = this.set("homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeRealmDiscoveryPolicies: Self = this.set("homeRealmDiscoveryPolicies", js.undefined)
    @scala.inline
    def setTokenIssuancePoliciesVarargs(value: TokenIssuancePolicy*): Self = this.set("tokenIssuancePolicies", js.Array(value :_*))
    @scala.inline
    def setTokenIssuancePolicies(value: js.Array[TokenIssuancePolicy]): Self = this.set("tokenIssuancePolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenIssuancePolicies: Self = this.set("tokenIssuancePolicies", js.undefined)
    @scala.inline
    def setTokenLifetimePoliciesVarargs(value: TokenLifetimePolicy*): Self = this.set("tokenLifetimePolicies", js.Array(value :_*))
    @scala.inline
    def setTokenLifetimePolicies(value: js.Array[TokenLifetimePolicy]): Self = this.set("tokenLifetimePolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenLifetimePolicies: Self = this.set("tokenLifetimePolicies", js.undefined)
  }
  
}

