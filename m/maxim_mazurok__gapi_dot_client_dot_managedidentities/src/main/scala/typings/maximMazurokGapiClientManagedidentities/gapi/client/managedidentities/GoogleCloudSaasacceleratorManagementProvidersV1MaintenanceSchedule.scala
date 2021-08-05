package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule extends StObject {
  
  /** Can this scheduled update be rescheduled? By default, it's true and API needs to do explicitly check whether it's set, if it's set as false explicitly, it's false */
  var canReschedule: js.UndefOr[Boolean] = js.undefined
  
  /** The scheduled end time for the maintenance. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The rollout management policy this maintenance schedule is associated with. When doing reschedule update request, the reschedule should be against this given policy. */
  var rolloutManagementPolicy: js.UndefOr[String] = js.undefined
  
  /** The scheduled start time for the maintenance. */
  var startTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule {
  
  inline def apply(): GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule]
  }
  
  extension [Self <: GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule](x: Self) {
    
    inline def setCanReschedule(value: Boolean): Self = StObject.set(x, "canReschedule", value.asInstanceOf[js.Any])
    
    inline def setCanRescheduleUndefined: Self = StObject.set(x, "canReschedule", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setRolloutManagementPolicy(value: String): Self = StObject.set(x, "rolloutManagementPolicy", value.asInstanceOf[js.Any])
    
    inline def setRolloutManagementPolicyUndefined: Self = StObject.set(x, "rolloutManagementPolicy", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
