package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetInstanceAcceleratorRequest extends js.Object {
  
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
  implicit class SetInstanceAcceleratorRequestOps[Self <: SetInstanceAcceleratorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoreCount(value: String): Self = this.set("coreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreCount: Self = this.set("coreCount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
