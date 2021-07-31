package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInstanceMachineTypeRequest extends StObject {
  
  /** Required. The [Compute Engine machine type](https://cloud.google.com/compute/docs/machine-types). */
  var machineType: js.UndefOr[String] = js.undefined
}
object SetInstanceMachineTypeRequest {
  
  @scala.inline
  def apply(): SetInstanceMachineTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetInstanceMachineTypeRequest]
  }
  
  @scala.inline
  implicit class SetInstanceMachineTypeRequestMutableBuilder[Self <: SetInstanceMachineTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
  }
}
