package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesCloneRequest extends js.Object {
  
  /** Contains details about the clone operation. */
  var cloneContext: js.UndefOr[CloneContext] = js.native
}
object InstancesCloneRequest {
  
  @scala.inline
  def apply(): InstancesCloneRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesCloneRequest]
  }
  
  @scala.inline
  implicit class InstancesCloneRequestOps[Self <: InstancesCloneRequest] (val x: Self) extends AnyVal {
    
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
    def setCloneContext(value: CloneContext): Self = this.set("cloneContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneContext: Self = this.set("cloneContext", js.undefined)
  }
}
