package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ManagedDeviceMobileAppConfigurationMutableBuilder[Self <: ManagedDeviceMobileAppConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[ManagedDeviceMobileAppConfigurationAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsVarargs(value: ManagedDeviceMobileAppConfigurationAssignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
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
    def setDeviceStatusSummary(value: NullableOption[ManagedDeviceMobileAppConfigurationDeviceSummary]): Self = StObject.set(x, "deviceStatusSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatusSummaryNull: Self = StObject.set(x, "deviceStatusSummary", null)
    
    @scala.inline
    def setDeviceStatusSummaryUndefined: Self = StObject.set(x, "deviceStatusSummary", js.undefined)
    
    @scala.inline
    def setDeviceStatuses(value: NullableOption[js.Array[ManagedDeviceMobileAppConfigurationDeviceStatus]]): Self = StObject.set(x, "deviceStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatusesNull: Self = StObject.set(x, "deviceStatuses", null)
    
    @scala.inline
    def setDeviceStatusesUndefined: Self = StObject.set(x, "deviceStatuses", js.undefined)
    
    @scala.inline
    def setDeviceStatusesVarargs(value: ManagedDeviceMobileAppConfigurationDeviceStatus*): Self = StObject.set(x, "deviceStatuses", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setTargetedMobileApps(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "targetedMobileApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetedMobileAppsNull: Self = StObject.set(x, "targetedMobileApps", null)
    
    @scala.inline
    def setTargetedMobileAppsUndefined: Self = StObject.set(x, "targetedMobileApps", js.undefined)
    
    @scala.inline
    def setTargetedMobileAppsVarargs(value: String*): Self = StObject.set(x, "targetedMobileApps", js.Array(value :_*))
    
    @scala.inline
    def setUserStatusSummary(value: NullableOption[ManagedDeviceMobileAppConfigurationUserSummary]): Self = StObject.set(x, "userStatusSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStatusSummaryNull: Self = StObject.set(x, "userStatusSummary", null)
    
    @scala.inline
    def setUserStatusSummaryUndefined: Self = StObject.set(x, "userStatusSummary", js.undefined)
    
    @scala.inline
    def setUserStatuses(value: NullableOption[js.Array[ManagedDeviceMobileAppConfigurationUserStatus]]): Self = StObject.set(x, "userStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStatusesNull: Self = StObject.set(x, "userStatuses", null)
    
    @scala.inline
    def setUserStatusesUndefined: Self = StObject.set(x, "userStatuses", js.undefined)
    
    @scala.inline
    def setUserStatusesVarargs(value: ManagedDeviceMobileAppConfigurationUserStatus*): Self = StObject.set(x, "userStatuses", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
