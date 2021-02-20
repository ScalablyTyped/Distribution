package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class DeviceCompliancePolicyMutableBuilder[Self <: DeviceCompliancePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[DeviceCompliancePolicyAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsVarargs(value: DeviceCompliancePolicyAssignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDeviceSettingStateSummaries(value: NullableOption[js.Array[SettingStateDeviceSummary]]): Self = StObject.set(x, "deviceSettingStateSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSettingStateSummariesNull: Self = StObject.set(x, "deviceSettingStateSummaries", null)
    
    @scala.inline
    def setDeviceSettingStateSummariesUndefined: Self = StObject.set(x, "deviceSettingStateSummaries", js.undefined)
    
    @scala.inline
    def setDeviceSettingStateSummariesVarargs(value: SettingStateDeviceSummary*): Self = StObject.set(x, "deviceSettingStateSummaries", js.Array(value :_*))
    
    @scala.inline
    def setDeviceStatusOverview(value: NullableOption[DeviceComplianceDeviceOverview]): Self = StObject.set(x, "deviceStatusOverview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatusOverviewNull: Self = StObject.set(x, "deviceStatusOverview", null)
    
    @scala.inline
    def setDeviceStatusOverviewUndefined: Self = StObject.set(x, "deviceStatusOverview", js.undefined)
    
    @scala.inline
    def setDeviceStatuses(value: NullableOption[js.Array[DeviceComplianceDeviceStatus]]): Self = StObject.set(x, "deviceStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatusesNull: Self = StObject.set(x, "deviceStatuses", null)
    
    @scala.inline
    def setDeviceStatusesUndefined: Self = StObject.set(x, "deviceStatuses", js.undefined)
    
    @scala.inline
    def setDeviceStatusesVarargs(value: DeviceComplianceDeviceStatus*): Self = StObject.set(x, "deviceStatuses", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setScheduledActionsForRule(value: NullableOption[js.Array[DeviceComplianceScheduledActionForRule]]): Self = StObject.set(x, "scheduledActionsForRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledActionsForRuleNull: Self = StObject.set(x, "scheduledActionsForRule", null)
    
    @scala.inline
    def setScheduledActionsForRuleUndefined: Self = StObject.set(x, "scheduledActionsForRule", js.undefined)
    
    @scala.inline
    def setScheduledActionsForRuleVarargs(value: DeviceComplianceScheduledActionForRule*): Self = StObject.set(x, "scheduledActionsForRule", js.Array(value :_*))
    
    @scala.inline
    def setUserStatusOverview(value: NullableOption[DeviceComplianceUserOverview]): Self = StObject.set(x, "userStatusOverview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStatusOverviewNull: Self = StObject.set(x, "userStatusOverview", null)
    
    @scala.inline
    def setUserStatusOverviewUndefined: Self = StObject.set(x, "userStatusOverview", js.undefined)
    
    @scala.inline
    def setUserStatuses(value: NullableOption[js.Array[DeviceComplianceUserStatus]]): Self = StObject.set(x, "userStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStatusesNull: Self = StObject.set(x, "userStatuses", null)
    
    @scala.inline
    def setUserStatusesUndefined: Self = StObject.set(x, "userStatuses", js.undefined)
    
    @scala.inline
    def setUserStatusesVarargs(value: DeviceComplianceUserStatus*): Self = StObject.set(x, "userStatuses", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
