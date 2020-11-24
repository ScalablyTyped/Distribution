package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesRotateServerCaRequest extends js.Object {
  
  /** Contains details about the rotate server CA operation. */
  var rotateServerCaContext: js.UndefOr[RotateServerCaContext] = js.native
}
object InstancesRotateServerCaRequest {
  
  @scala.inline
  def apply(): InstancesRotateServerCaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesRotateServerCaRequest]
  }
  
  @scala.inline
  implicit class InstancesRotateServerCaRequestOps[Self <: InstancesRotateServerCaRequest] (val x: Self) extends AnyVal {
    
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
    def setRotateServerCaContext(value: RotateServerCaContext): Self = this.set("rotateServerCaContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateServerCaContext: Self = this.set("rotateServerCaContext", js.undefined)
  }
}
