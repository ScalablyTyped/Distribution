package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule extends js.Object {
  
  /** Can this scheduled update be rescheduled? By default, it's true and API needs to do explicitly check whether it's set, if it's set as false explicitly, it's false */
  var canReschedule: js.UndefOr[Boolean] = js.native
  
  /** The scheduled end time for the maintenance. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The rollout management policy this maintenance schedule is associated with. When doing reschedule update request, the reschedule should be against this given policy. */
  var rolloutManagementPolicy: js.UndefOr[String] = js.native
  
  /** The scheduled start time for the maintenance. */
  var startTime: js.UndefOr[String] = js.native
}
object GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceScheduleOps[Self <: GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule] (val x: Self) extends AnyVal {
    
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
    def setCanReschedule(value: Boolean): Self = this.set("canReschedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanReschedule: Self = this.set("canReschedule", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setRolloutManagementPolicy(value: String): Self = this.set("rolloutManagementPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolloutManagementPolicy: Self = this.set("rolloutManagementPolicy", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
