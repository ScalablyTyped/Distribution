package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationDnsKeyContext extends js.Object {
  
  /** The post-operation DnsKey resource. */
  var newValue: js.UndefOr[DnsKey] = js.native
  
  /** The pre-operation DnsKey resource. */
  var oldValue: js.UndefOr[DnsKey] = js.native
}
object OperationDnsKeyContext {
  
  @scala.inline
  def apply(): OperationDnsKeyContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationDnsKeyContext]
  }
  
  @scala.inline
  implicit class OperationDnsKeyContextOps[Self <: OperationDnsKeyContext] (val x: Self) extends AnyVal {
    
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
    def setNewValue(value: DnsKey): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: DnsKey): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
}
