package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualMachine extends StObject {
  
  /** Output only. The unique identifier of the Managed Compute Engine instance. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** Output only. The user-friendly name of the Managed Compute Engine instance. */
  var instanceName: js.UndefOr[String] = js.undefined
  
  /** Virtual Machine configuration settings. */
  var virtualMachineConfig: js.UndefOr[VirtualMachineConfig] = js.undefined
}
object VirtualMachine {
  
  inline def apply(): VirtualMachine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualMachine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualMachine] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setVirtualMachineConfig(value: VirtualMachineConfig): Self = StObject.set(x, "virtualMachineConfig", value.asInstanceOf[js.Any])
    
    inline def setVirtualMachineConfigUndefined: Self = StObject.set(x, "virtualMachineConfig", js.undefined)
  }
}
