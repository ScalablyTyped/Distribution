package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceCompliancePolicy extends Entity {
  
  // The collection of assignments for this compliance policy.
  var assignments: js.UndefOr[NullableOption[js.Array[DeviceCompliancePolicyAssignment]]] = js.native
  
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Compliance Setting State Device Summary
  var deviceSettingStateSummaries: js.UndefOr[NullableOption[js.Array[SettingStateDeviceSummary]]] = js.native
  
  // Device compliance devices status overview
  var deviceStatusOverview: js.UndefOr[NullableOption[DeviceComplianceDeviceOverview]] = js.native
  
  // List of DeviceComplianceDeviceStatus.
  var deviceStatuses: js.UndefOr[NullableOption[js.Array[DeviceComplianceDeviceStatus]]] = js.native
  
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.native
  
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  // The list of scheduled action for this rule
  var scheduledActionsForRule: js.UndefOr[NullableOption[js.Array[DeviceComplianceScheduledActionForRule]]] = js.native
  
  // Device compliance users status overview
  var userStatusOverview: js.UndefOr[NullableOption[DeviceComplianceUserOverview]] = js.native
  
  // List of DeviceComplianceUserStatus.
  var userStatuses: js.UndefOr[NullableOption[js.Array[DeviceComplianceUserStatus]]] = js.native
  
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.native
}
object DeviceCompliancePolicy {
  
  @scala.inline
  def apply(): DeviceCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompliancePolicy]
  }
  
  @scala.inline
  implicit class DeviceCompliancePolicyOps[Self <: DeviceCompliancePolicy] (val x: Self) extends AnyVal {
    
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
    def setAssignmentsVarargs(value: DeviceCompliancePolicyAssignment*): Self = this.set("assignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[DeviceCompliancePolicyAssignment]]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsNull: Self = this.set("assignments", null)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDeviceSettingStateSummariesVarargs(value: SettingStateDeviceSummary*): Self = this.set("deviceSettingStateSummaries", js.Array(value :_*))
    
    @scala.inline
    def setDeviceSettingStateSummaries(value: NullableOption[js.Array[SettingStateDeviceSummary]]): Self = this.set("deviceSettingStateSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSettingStateSummaries: Self = this.set("deviceSettingStateSummaries", js.undefined)
    
    @scala.inline
    def setDeviceSettingStateSummariesNull: Self = this.set("deviceSettingStateSummaries", null)
    
    @scala.inline
    def setDeviceStatusOverview(value: NullableOption[DeviceComplianceDeviceOverview]): Self = this.set("deviceStatusOverview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceStatusOverview: Self = this.set("deviceStatusOverview", js.undefined)
    
    @scala.inline
    def setDeviceStatusOverviewNull: Self = this.set("deviceStatusOverview", null)
    
    @scala.inline
    def setDeviceStatusesVarargs(value: DeviceComplianceDeviceStatus*): Self = this.set("deviceStatuses", js.Array(value :_*))
    
    @scala.inline
    def setDeviceStatuses(value: NullableOption[js.Array[DeviceComplianceDeviceStatus]]): Self = this.set("deviceStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceStatuses: Self = this.set("deviceStatuses", js.undefined)
    
    @scala.inline
    def setDeviceStatusesNull: Self = this.set("deviceStatuses", null)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setScheduledActionsForRuleVarargs(value: DeviceComplianceScheduledActionForRule*): Self = this.set("scheduledActionsForRule", js.Array(value :_*))
    
    @scala.inline
    def setScheduledActionsForRule(value: NullableOption[js.Array[DeviceComplianceScheduledActionForRule]]): Self = this.set("scheduledActionsForRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledActionsForRule: Self = this.set("scheduledActionsForRule", js.undefined)
    
    @scala.inline
    def setScheduledActionsForRuleNull: Self = this.set("scheduledActionsForRule", null)
    
    @scala.inline
    def setUserStatusOverview(value: NullableOption[DeviceComplianceUserOverview]): Self = this.set("userStatusOverview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStatusOverview: Self = this.set("userStatusOverview", js.undefined)
    
    @scala.inline
    def setUserStatusOverviewNull: Self = this.set("userStatusOverview", null)
    
    @scala.inline
    def setUserStatusesVarargs(value: DeviceComplianceUserStatus*): Self = this.set("userStatuses", js.Array(value :_*))
    
    @scala.inline
    def setUserStatuses(value: NullableOption[js.Array[DeviceComplianceUserStatus]]): Self = this.set("userStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStatuses: Self = this.set("userStatuses", js.undefined)
    
    @scala.inline
    def setUserStatusesNull: Self = this.set("userStatuses", null)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
