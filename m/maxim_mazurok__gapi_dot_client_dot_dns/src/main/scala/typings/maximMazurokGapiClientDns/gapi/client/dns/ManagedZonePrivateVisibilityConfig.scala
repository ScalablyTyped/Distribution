package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedZonePrivateVisibilityConfig extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** The list of VPC networks that can see this zone. */
  var networks: js.UndefOr[js.Array[ManagedZonePrivateVisibilityConfigNetwork]] = js.undefined
}
object ManagedZonePrivateVisibilityConfig {
  
  inline def apply(): ManagedZonePrivateVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZonePrivateVisibilityConfig]
  }
  
  extension [Self <: ManagedZonePrivateVisibilityConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNetworks(value: js.Array[ManagedZonePrivateVisibilityConfigNetwork]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: ManagedZonePrivateVisibilityConfigNetwork*): Self = StObject.set(x, "networks", js.Array(value*))
  }
}
