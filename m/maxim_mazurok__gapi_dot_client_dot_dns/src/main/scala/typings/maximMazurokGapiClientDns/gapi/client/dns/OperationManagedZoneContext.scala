package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationManagedZoneContext extends js.Object {
  
  /** The post-operation ManagedZone resource. */
  var newValue: js.UndefOr[ManagedZone] = js.native
  
  /** The pre-operation ManagedZone resource. */
  var oldValue: js.UndefOr[ManagedZone] = js.native
}
object OperationManagedZoneContext {
  
  @scala.inline
  def apply(): OperationManagedZoneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationManagedZoneContext]
  }
  
  @scala.inline
  implicit class OperationManagedZoneContextOps[Self <: OperationManagedZoneContext] (val x: Self) extends AnyVal {
    
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
    def setNewValue(value: ManagedZone): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: ManagedZone): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
}
