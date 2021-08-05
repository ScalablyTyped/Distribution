package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationDnsKeyContext extends StObject {
  
  /** The post-operation DnsKey resource. */
  var newValue: js.UndefOr[DnsKey] = js.undefined
  
  /** The pre-operation DnsKey resource. */
  var oldValue: js.UndefOr[DnsKey] = js.undefined
}
object OperationDnsKeyContext {
  
  inline def apply(): OperationDnsKeyContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationDnsKeyContext]
  }
  
  extension [Self <: OperationDnsKeyContext](x: Self) {
    
    inline def setNewValue(value: DnsKey): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: DnsKey): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
