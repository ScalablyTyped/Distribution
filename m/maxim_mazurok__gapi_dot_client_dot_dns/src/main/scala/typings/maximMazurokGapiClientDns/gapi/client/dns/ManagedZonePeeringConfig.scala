package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedZonePeeringConfig extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** The network with which to peer. */
  var targetNetwork: js.UndefOr[ManagedZonePeeringConfigTargetNetwork] = js.undefined
}
object ManagedZonePeeringConfig {
  
  inline def apply(): ManagedZonePeeringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZonePeeringConfig]
  }
  
  extension [Self <: ManagedZonePeeringConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTargetNetwork(value: ManagedZonePeeringConfigTargetNetwork): Self = StObject.set(x, "targetNetwork", value.asInstanceOf[js.Any])
    
    inline def setTargetNetworkUndefined: Self = StObject.set(x, "targetNetwork", js.undefined)
  }
}
