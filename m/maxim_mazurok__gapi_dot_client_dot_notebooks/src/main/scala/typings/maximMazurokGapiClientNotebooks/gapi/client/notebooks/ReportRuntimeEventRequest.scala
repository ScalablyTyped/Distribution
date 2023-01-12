package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportRuntimeEventRequest extends StObject {
  
  /** Required. The Event to be reported. */
  var event: js.UndefOr[Event] = js.undefined
  
  /** Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity */
  var vmId: js.UndefOr[String] = js.undefined
}
object ReportRuntimeEventRequest {
  
  inline def apply(): ReportRuntimeEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRuntimeEventRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportRuntimeEventRequest] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}
