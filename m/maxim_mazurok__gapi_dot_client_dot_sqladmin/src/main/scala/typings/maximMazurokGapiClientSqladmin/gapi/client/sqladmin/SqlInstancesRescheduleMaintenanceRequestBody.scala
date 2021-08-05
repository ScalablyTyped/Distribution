package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlInstancesRescheduleMaintenanceRequestBody extends StObject {
  
  /** Required. The type of the reschedule the user wants. */
  var reschedule: js.UndefOr[Reschedule] = js.undefined
}
object SqlInstancesRescheduleMaintenanceRequestBody {
  
  inline def apply(): SqlInstancesRescheduleMaintenanceRequestBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlInstancesRescheduleMaintenanceRequestBody]
  }
  
  extension [Self <: SqlInstancesRescheduleMaintenanceRequestBody](x: Self) {
    
    inline def setReschedule(value: Reschedule): Self = StObject.set(x, "reschedule", value.asInstanceOf[js.Any])
    
    inline def setRescheduleUndefined: Self = StObject.set(x, "reschedule", js.undefined)
  }
}
