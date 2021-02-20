package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetInstanceAcceleratorRequest extends StObject {
  
  /**
    * Required. Count of cores of this accelerator. Note that not all combinations of `type` and `core_count` are valid. Check [GPUs on Compute
    * Engine](https://cloud.google.com/compute/docs/gpus/#gpus-list) to find a valid combination. TPUs are not supported.
    */
  var coreCount: js.UndefOr[String] = js.native
  
  /** Required. Type of this accelerator. */
  var `type`: js.UndefOr[String] = js.native
}
object SetInstanceAcceleratorRequest {
  
  @scala.inline
  def apply(): SetInstanceAcceleratorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetInstanceAcceleratorRequest]
  }
  
  @scala.inline
  implicit class SetInstanceAcceleratorRequestMutableBuilder[Self <: SetInstanceAcceleratorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoreCount(value: String): Self = StObject.set(x, "coreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreCountUndefined: Self = StObject.set(x, "coreCount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
