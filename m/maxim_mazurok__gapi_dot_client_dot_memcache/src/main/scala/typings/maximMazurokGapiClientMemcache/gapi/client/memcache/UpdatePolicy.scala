package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePolicy extends js.Object {
  
  /** Optional. Relative scheduling channel applied to resource. */
  var channel: js.UndefOr[String] = js.native
  
  /**
    * Deny Maintenance Period that is applied to resource to indicate when maintenance is forbidden. User can specify zero or more non-overlapping deny periods. For V1, Maximum number of
    * deny_maintenance_periods is expected to be one.
    */
  var denyMaintenancePeriods: js.UndefOr[js.Array[DenyMaintenancePeriod]] = js.native
  
  /** Optional. Maintenance window that is applied to resources covered by this policy. */
  var window: js.UndefOr[MaintenanceWindow] = js.native
}
object UpdatePolicy {
  
  @scala.inline
  def apply(): UpdatePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePolicy]
  }
  
  @scala.inline
  implicit class UpdatePolicyOps[Self <: UpdatePolicy] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setDenyMaintenancePeriodsVarargs(value: DenyMaintenancePeriod*): Self = this.set("denyMaintenancePeriods", js.Array(value :_*))
    
    @scala.inline
    def setDenyMaintenancePeriods(value: js.Array[DenyMaintenancePeriod]): Self = this.set("denyMaintenancePeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDenyMaintenancePeriods: Self = this.set("denyMaintenancePeriods", js.undefined)
    
    @scala.inline
    def setWindow(value: MaintenanceWindow): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}
