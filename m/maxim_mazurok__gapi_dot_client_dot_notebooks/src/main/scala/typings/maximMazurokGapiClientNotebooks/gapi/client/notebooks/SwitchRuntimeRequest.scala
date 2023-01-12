package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchRuntimeRequest extends StObject {
  
  /** accelerator config. */
  var acceleratorConfig: js.UndefOr[RuntimeAcceleratorConfig] = js.undefined
  
  /** machine type. */
  var machineType: js.UndefOr[String] = js.undefined
  
  /** Idempotent request UUID. */
  var requestId: js.UndefOr[String] = js.undefined
}
object SwitchRuntimeRequest {
  
  inline def apply(): SwitchRuntimeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchRuntimeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchRuntimeRequest] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorConfig(value: RuntimeAcceleratorConfig): Self = StObject.set(x, "acceleratorConfig", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorConfigUndefined: Self = StObject.set(x, "acceleratorConfig", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
