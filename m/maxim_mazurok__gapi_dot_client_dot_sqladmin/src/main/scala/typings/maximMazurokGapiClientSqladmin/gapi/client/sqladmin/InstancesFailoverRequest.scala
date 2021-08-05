package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesFailoverRequest extends StObject {
  
  /** Failover Context. */
  var failoverContext: js.UndefOr[FailoverContext] = js.undefined
}
object InstancesFailoverRequest {
  
  inline def apply(): InstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesFailoverRequest]
  }
  
  extension [Self <: InstancesFailoverRequest](x: Self) {
    
    inline def setFailoverContext(value: FailoverContext): Self = StObject.set(x, "failoverContext", value.asInstanceOf[js.Any])
    
    inline def setFailoverContextUndefined: Self = StObject.set(x, "failoverContext", js.undefined)
  }
}
