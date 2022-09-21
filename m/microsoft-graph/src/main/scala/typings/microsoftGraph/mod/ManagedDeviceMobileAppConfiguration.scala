package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedDeviceMobileAppConfiguration
  extends StObject
     with Entity {
  
  // The list of group assignemenets for app configration.
  var assignments: js.UndefOr[NullableOption[js.Array[ManagedDeviceMobileAppConfigurationAssignment]]] = js.undefined
  
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // App configuration device status summary.
  var deviceStatusSummary: js.UndefOr[NullableOption[ManagedDeviceMobileAppConfigurationDeviceSummary]] = js.undefined
  
  // List of ManagedDeviceMobileAppConfigurationDeviceStatus.
  var deviceStatuses: js.UndefOr[NullableOption[js.Array[ManagedDeviceMobileAppConfigurationDeviceStatus]]] = js.undefined
  
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.undefined
  
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // the associated app.
  var targetedMobileApps: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // App configuration user status summary.
  var userStatusSummary: js.UndefOr[NullableOption[ManagedDeviceMobileAppConfigurationUserSummary]] = js.undefined
  
  // List of ManagedDeviceMobileAppConfigurationUserStatus.
  var userStatuses: js.UndefOr[NullableOption[js.Array[ManagedDeviceMobileAppConfigurationUserStatus]]] = js.undefined
  
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.undefined
}
object ManagedDeviceMobileAppConfiguration {
  
  inline def apply(): ManagedDeviceMobileAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceMobileAppConfiguration]
  }
  
  extension [Self <: ManagedDeviceMobileAppConfiguration](x: Self) {
    
    inline def setAssignments(value: NullableOption[js.Array[ManagedDeviceMobileAppConfigurationAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: ManagedDeviceMobileAppConfigurationAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeviceStatusSummary(value: NullableOption[ManagedDeviceMobileAppConfigurationDeviceSummary]): Self = StObject.set(x, "deviceStatusSummary", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatusSummaryNull: Self = StObject.set(x, "deviceStatusSummary", null)
    
    inline def setDeviceStatusSummaryUndefined: Self = StObject.set(x, "deviceStatusSummary", js.undefined)
    
    inline def setDeviceStatuses(value: NullableOption[js.Array[ManagedDeviceMobileAppConfigurationDeviceStatus]]): Self = StObject.set(x, "deviceStatuses", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatusesNull: Self = StObject.set(x, "deviceStatuses", null)
    
    inline def setDeviceStatusesUndefined: Self = StObject.set(x, "deviceStatuses", js.undefined)
    
    inline def setDeviceStatusesVarargs(value: ManagedDeviceMobileAppConfigurationDeviceStatus*): Self = StObject.set(x, "deviceStatuses", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setTargetedMobileApps(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "targetedMobileApps", value.asInstanceOf[js.Any])
    
    inline def setTargetedMobileAppsNull: Self = StObject.set(x, "targetedMobileApps", null)
    
    inline def setTargetedMobileAppsUndefined: Self = StObject.set(x, "targetedMobileApps", js.undefined)
    
    inline def setTargetedMobileAppsVarargs(value: String*): Self = StObject.set(x, "targetedMobileApps", js.Array(value*))
    
    inline def setUserStatusSummary(value: NullableOption[ManagedDeviceMobileAppConfigurationUserSummary]): Self = StObject.set(x, "userStatusSummary", value.asInstanceOf[js.Any])
    
    inline def setUserStatusSummaryNull: Self = StObject.set(x, "userStatusSummary", null)
    
    inline def setUserStatusSummaryUndefined: Self = StObject.set(x, "userStatusSummary", js.undefined)
    
    inline def setUserStatuses(value: NullableOption[js.Array[ManagedDeviceMobileAppConfigurationUserStatus]]): Self = StObject.set(x, "userStatuses", value.asInstanceOf[js.Any])
    
    inline def setUserStatusesNull: Self = StObject.set(x, "userStatuses", null)
    
    inline def setUserStatusesUndefined: Self = StObject.set(x, "userStatuses", js.undefined)
    
    inline def setUserStatusesVarargs(value: ManagedDeviceMobileAppConfigurationUserStatus*): Self = StObject.set(x, "userStatuses", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
