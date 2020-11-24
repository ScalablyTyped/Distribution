package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesDemoteMasterRequest extends js.Object {
  
  /** Contains details about the demoteMaster operation. */
  var demoteMasterContext: js.UndefOr[DemoteMasterContext] = js.native
}
object InstancesDemoteMasterRequest {
  
  @scala.inline
  def apply(): InstancesDemoteMasterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesDemoteMasterRequest]
  }
  
  @scala.inline
  implicit class InstancesDemoteMasterRequestOps[Self <: InstancesDemoteMasterRequest] (val x: Self) extends AnyVal {
    
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
    def setDemoteMasterContext(value: DemoteMasterContext): Self = this.set("demoteMasterContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemoteMasterContext: Self = this.set("demoteMasterContext", js.undefined)
  }
}
