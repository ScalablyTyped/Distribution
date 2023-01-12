package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceConfiguration
  extends StObject
     with Entity {
  
  // The list of assignments for the device configuration profile.
  var assignments: js.UndefOr[NullableOption[js.Array[DeviceConfigurationAssignment]]] = js.undefined
  
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device Configuration Setting State Device Summary
  var deviceSettingStateSummaries: js.UndefOr[NullableOption[js.Array[SettingStateDeviceSummary]]] = js.undefined
  
  // Device Configuration devices status overview
  var deviceStatusOverview: js.UndefOr[NullableOption[DeviceConfigurationDeviceOverview]] = js.undefined
  
  // Device configuration installation status by device.
  var deviceStatuses: js.UndefOr[NullableOption[js.Array[DeviceConfigurationDeviceStatus]]] = js.undefined
  
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.undefined
  
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // Device Configuration users status overview
  var userStatusOverview: js.UndefOr[NullableOption[DeviceConfigurationUserOverview]] = js.undefined
  
  // Device configuration installation status by user.
  var userStatuses: js.UndefOr[NullableOption[js.Array[DeviceConfigurationUserStatus]]] = js.undefined
  
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.undefined
}
object DeviceConfiguration {
  
  inline def apply(): DeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAssignments(value: NullableOption[js.Array[DeviceConfigurationAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: DeviceConfigurationAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeviceSettingStateSummaries(value: NullableOption[js.Array[SettingStateDeviceSummary]]): Self = StObject.set(x, "deviceSettingStateSummaries", value.asInstanceOf[js.Any])
    
    inline def setDeviceSettingStateSummariesNull: Self = StObject.set(x, "deviceSettingStateSummaries", null)
    
    inline def setDeviceSettingStateSummariesUndefined: Self = StObject.set(x, "deviceSettingStateSummaries", js.undefined)
    
    inline def setDeviceSettingStateSummariesVarargs(value: SettingStateDeviceSummary*): Self = StObject.set(x, "deviceSettingStateSummaries", js.Array(value*))
    
    inline def setDeviceStatusOverview(value: NullableOption[DeviceConfigurationDeviceOverview]): Self = StObject.set(x, "deviceStatusOverview", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatusOverviewNull: Self = StObject.set(x, "deviceStatusOverview", null)
    
    inline def setDeviceStatusOverviewUndefined: Self = StObject.set(x, "deviceStatusOverview", js.undefined)
    
    inline def setDeviceStatuses(value: NullableOption[js.Array[DeviceConfigurationDeviceStatus]]): Self = StObject.set(x, "deviceStatuses", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatusesNull: Self = StObject.set(x, "deviceStatuses", null)
    
    inline def setDeviceStatusesUndefined: Self = StObject.set(x, "deviceStatuses", js.undefined)
    
    inline def setDeviceStatusesVarargs(value: DeviceConfigurationDeviceStatus*): Self = StObject.set(x, "deviceStatuses", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setUserStatusOverview(value: NullableOption[DeviceConfigurationUserOverview]): Self = StObject.set(x, "userStatusOverview", value.asInstanceOf[js.Any])
    
    inline def setUserStatusOverviewNull: Self = StObject.set(x, "userStatusOverview", null)
    
    inline def setUserStatusOverviewUndefined: Self = StObject.set(x, "userStatusOverview", js.undefined)
    
    inline def setUserStatuses(value: NullableOption[js.Array[DeviceConfigurationUserStatus]]): Self = StObject.set(x, "userStatuses", value.asInstanceOf[js.Any])
    
    inline def setUserStatusesNull: Self = StObject.set(x, "userStatuses", null)
    
    inline def setUserStatusesUndefined: Self = StObject.set(x, "userStatuses", js.undefined)
    
    inline def setUserStatusesVarargs(value: DeviceConfigurationUserStatus*): Self = StObject.set(x, "userStatuses", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
