package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlInstancesRescheduleMaintenanceRequestBody extends StObject {
  
  /** Required. The type of the reschedule the user wants. */
  var reschedule: js.UndefOr[Reschedule] = js.native
}
object SqlInstancesRescheduleMaintenanceRequestBody {
  
  @scala.inline
  def apply(): SqlInstancesRescheduleMaintenanceRequestBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlInstancesRescheduleMaintenanceRequestBody]
  }
  
  @scala.inline
  implicit class SqlInstancesRescheduleMaintenanceRequestBodyMutableBuilder[Self <: SqlInstancesRescheduleMaintenanceRequestBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReschedule(value: Reschedule): Self = StObject.set(x, "reschedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRescheduleUndefined: Self = StObject.set(x, "reschedule", js.undefined)
  }
}
