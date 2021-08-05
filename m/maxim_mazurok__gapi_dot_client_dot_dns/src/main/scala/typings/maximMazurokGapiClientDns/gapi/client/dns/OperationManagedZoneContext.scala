package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationManagedZoneContext extends StObject {
  
  /** The post-operation ManagedZone resource. */
  var newValue: js.UndefOr[ManagedZone] = js.undefined
  
  /** The pre-operation ManagedZone resource. */
  var oldValue: js.UndefOr[ManagedZone] = js.undefined
}
object OperationManagedZoneContext {
  
  inline def apply(): OperationManagedZoneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationManagedZoneContext]
  }
  
  extension [Self <: OperationManagedZoneContext](x: Self) {
    
    inline def setNewValue(value: ManagedZone): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: ManagedZone): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
