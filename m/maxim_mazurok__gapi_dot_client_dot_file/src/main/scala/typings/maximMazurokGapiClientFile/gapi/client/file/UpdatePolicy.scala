package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePolicy extends StObject {
  
  /** Optional. Relative scheduling channel applied to resource. */
  var channel: js.UndefOr[String] = js.undefined
  
  /**
    * Deny Maintenance Period that is applied to resource to indicate when maintenance is forbidden. User can specify zero or more non-overlapping deny periods. For V1, Maximum number of
    * deny_maintenance_periods is expected to be one.
    */
  var denyMaintenancePeriods: js.UndefOr[js.Array[DenyMaintenancePeriod]] = js.undefined
  
  /** Optional. Maintenance window that is applied to resources covered by this policy. */
  var window: js.UndefOr[MaintenanceWindow] = js.undefined
}
object UpdatePolicy {
  
  @scala.inline
  def apply(): UpdatePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePolicy]
  }
  
  @scala.inline
  implicit class UpdatePolicyMutableBuilder[Self <: UpdatePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setDenyMaintenancePeriods(value: js.Array[DenyMaintenancePeriod]): Self = StObject.set(x, "denyMaintenancePeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenyMaintenancePeriodsUndefined: Self = StObject.set(x, "denyMaintenancePeriods", js.undefined)
    
    @scala.inline
    def setDenyMaintenancePeriodsVarargs(value: DenyMaintenancePeriod*): Self = StObject.set(x, "denyMaintenancePeriods", js.Array(value :_*))
    
    @scala.inline
    def setWindow(value: MaintenanceWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
