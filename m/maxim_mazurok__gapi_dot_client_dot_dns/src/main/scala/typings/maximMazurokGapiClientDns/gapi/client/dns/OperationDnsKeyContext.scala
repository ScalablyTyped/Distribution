package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationDnsKeyContext extends StObject {
  
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
  implicit class OperationDnsKeyContextMutableBuilder[Self <: OperationDnsKeyContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: DnsKey): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: DnsKey): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
