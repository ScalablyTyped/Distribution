package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePolicy extends StObject {
  
  /** Optional. Relative scheduling channel applied to resource. */
  var channel: js.UndefOr[String] = js.undefined
  
  /**
    * Deny Maintenance Period that is applied to resource to indicate when maintenance is forbidden. User can specify zero or more non-overlapping deny periods. Maximum number of
    * deny_maintenance_periods expected is one.
    */
  var denyMaintenancePeriods: js.UndefOr[js.Array[DenyMaintenancePeriod]] = js.undefined
  
  /** Optional. Maintenance window that is applied to resources covered by this policy. */
  var window: js.UndefOr[MaintenanceWindow] = js.undefined
}
object UpdatePolicy {
  
  inline def apply(): UpdatePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePolicy]
  }
  
  extension [Self <: UpdatePolicy](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setDenyMaintenancePeriods(value: js.Array[DenyMaintenancePeriod]): Self = StObject.set(x, "denyMaintenancePeriods", value.asInstanceOf[js.Any])
    
    inline def setDenyMaintenancePeriodsUndefined: Self = StObject.set(x, "denyMaintenancePeriods", js.undefined)
    
    inline def setDenyMaintenancePeriodsVarargs(value: DenyMaintenancePeriod*): Self = StObject.set(x, "denyMaintenancePeriods", js.Array(value*))
    
    inline def setWindow(value: MaintenanceWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
