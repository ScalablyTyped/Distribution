package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetInstanceMachineTypeRequest extends js.Object {
  
  /** Required. The [Compute Engine machine type](https://cloud.google.com/compute/docs/machine-types). */
  var machineType: js.UndefOr[String] = js.native
}
object SetInstanceMachineTypeRequest {
  
  @scala.inline
  def apply(): SetInstanceMachineTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetInstanceMachineTypeRequest]
  }
  
  @scala.inline
  implicit class SetInstanceMachineTypeRequestOps[Self <: SetInstanceMachineTypeRequest] (val x: Self) extends AnyVal {
    
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
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
  }
}
