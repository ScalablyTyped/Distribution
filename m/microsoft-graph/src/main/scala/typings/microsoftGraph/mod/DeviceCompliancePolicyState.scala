package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceCompliancePolicyState extends Entity {
  // The name of the policy for this policyBase
  var displayName: js.UndefOr[String] = js.native
  // Platform type that the policy applies to
  var platformType: js.UndefOr[PolicyPlatformType] = js.native
  // Count of how many setting a policy holds
  var settingCount: js.UndefOr[Double] = js.native
  var settingStates: js.UndefOr[js.Array[DeviceCompliancePolicySettingState]] = js.native
  // The compliance state of the policy
  var state: js.UndefOr[ComplianceStatus] = js.native
  // The version of the policy
  var version: js.UndefOr[Double] = js.native
}

object DeviceCompliancePolicyState {
  @scala.inline
  def apply(): DeviceCompliancePolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompliancePolicyState]
  }
  @scala.inline
  implicit class DeviceCompliancePolicyStateOps[Self <: DeviceCompliancePolicyState] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setPlatformType(value: PolicyPlatformType): Self = this.set("platformType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformType: Self = this.set("platformType", js.undefined)
    @scala.inline
    def setSettingCount(value: Double): Self = this.set("settingCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingCount: Self = this.set("settingCount", js.undefined)
    @scala.inline
    def setSettingStatesVarargs(value: DeviceCompliancePolicySettingState*): Self = this.set("settingStates", js.Array(value :_*))
    @scala.inline
    def setSettingStates(value: js.Array[DeviceCompliancePolicySettingState]): Self = this.set("settingStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingStates: Self = this.set("settingStates", js.undefined)
    @scala.inline
    def setState(value: ComplianceStatus): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

