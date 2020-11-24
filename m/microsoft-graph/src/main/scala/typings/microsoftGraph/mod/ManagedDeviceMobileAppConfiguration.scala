package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedDeviceMobileAppConfiguration extends Entity {
  
  // The list of group assignemenets for app configration.
  var assignments: js.UndefOr[NullableOption[js.Array[ManagedDeviceMobileAppConfigurationAssignment]]] = js.native
  
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // App configuration device status summary.
  var deviceStatusSummary: js.UndefOr[NullableOption[ManagedDeviceMobileAppConfigurationDeviceSummary]] = js.native
  
  // List of ManagedDeviceMobileAppConfigurationDeviceStatus.
  var deviceStatuses: js.UndefOr[NullableOption[js.Array[ManagedDeviceMobileAppConfigurationDeviceStatus]]] = js.native
  
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.native
  
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  // the associated app.
  var targetedMobileApps: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // App configuration user status summary.
  var userStatusSummary: js.UndefOr[NullableOption[ManagedDeviceMobileAppConfigurationUserSummary]] = js.native
  
  // List of ManagedDeviceMobileAppConfigurationUserStatus.
  var userStatuses: js.UndefOr[NullableOption[js.Array[ManagedDeviceMobileAppConfigurationUserStatus]]] = js.native
  
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.native
}
object ManagedDeviceMobileAppConfiguration {
  
  @scala.inline
  def apply(): ManagedDeviceMobileAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceMobileAppConfiguration]
  }
  
  @scala.inline
  implicit class ManagedDeviceMobileAppConfigurationOps[Self <: ManagedDeviceMobileAppConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAssignmentsVarargs(value: ManagedDeviceMobileAppConfigurationAssignment*): Self = this.set("assignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[ManagedDeviceMobileAppConfigurationAssignment]]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
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
    def setDeviceStatusSummary(value: NullableOption[ManagedDeviceMobileAppConfigurationDeviceSummary]): Self = this.set("deviceStatusSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceStatusSummary: Self = this.set("deviceStatusSummary", js.undefined)
    
    @scala.inline
    def setDeviceStatusSummaryNull: Self = this.set("deviceStatusSummary", null)
    
    @scala.inline
    def setDeviceStatusesVarargs(value: ManagedDeviceMobileAppConfigurationDeviceStatus*): Self = this.set("deviceStatuses", js.Array(value :_*))
    
    @scala.inline
    def setDeviceStatuses(value: NullableOption[js.Array[ManagedDeviceMobileAppConfigurationDeviceStatus]]): Self = this.set("deviceStatuses", value.asInstanceOf[js.Any])
    
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
    def setTargetedMobileAppsVarargs(value: String*): Self = this.set("targetedMobileApps", js.Array(value :_*))
    
    @scala.inline
    def setTargetedMobileApps(value: NullableOption[js.Array[String]]): Self = this.set("targetedMobileApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetedMobileApps: Self = this.set("targetedMobileApps", js.undefined)
    
    @scala.inline
    def setTargetedMobileAppsNull: Self = this.set("targetedMobileApps", null)
    
    @scala.inline
    def setUserStatusSummary(value: NullableOption[ManagedDeviceMobileAppConfigurationUserSummary]): Self = this.set("userStatusSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStatusSummary: Self = this.set("userStatusSummary", js.undefined)
    
    @scala.inline
    def setUserStatusSummaryNull: Self = this.set("userStatusSummary", null)
    
    @scala.inline
    def setUserStatusesVarargs(value: ManagedDeviceMobileAppConfigurationUserStatus*): Self = this.set("userStatuses", js.Array(value :_*))
    
    @scala.inline
    def setUserStatuses(value: NullableOption[js.Array[ManagedDeviceMobileAppConfigurationUserStatus]]): Self = this.set("userStatuses", value.asInstanceOf[js.Any])
    
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
