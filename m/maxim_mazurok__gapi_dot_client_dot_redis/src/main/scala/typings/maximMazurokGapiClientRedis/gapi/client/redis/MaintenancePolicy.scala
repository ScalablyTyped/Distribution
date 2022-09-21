package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenancePolicy extends StObject {
  
  /** Output only. The time when the policy was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. The time when the policy was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one. */
  var weeklyMaintenanceWindow: js.UndefOr[js.Array[WeeklyMaintenanceWindow]] = js.undefined
}
object MaintenancePolicy {
  
  inline def apply(): MaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenancePolicy]
  }
  
  extension [Self <: MaintenancePolicy](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWeeklyMaintenanceWindow(value: js.Array[WeeklyMaintenanceWindow]): Self = StObject.set(x, "weeklyMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceWindowUndefined: Self = StObject.set(x, "weeklyMaintenanceWindow", js.undefined)
    
    inline def setWeeklyMaintenanceWindowVarargs(value: WeeklyMaintenanceWindow*): Self = StObject.set(x, "weeklyMaintenanceWindow", js.Array(value*))
  }
}
