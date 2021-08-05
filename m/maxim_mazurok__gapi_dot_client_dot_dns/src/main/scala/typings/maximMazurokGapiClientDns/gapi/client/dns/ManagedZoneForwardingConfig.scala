package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedZoneForwardingConfig extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** List of target name servers to forward to. Cloud DNS will select the best available name server if more than one target is given. */
  var targetNameServers: js.UndefOr[js.Array[ManagedZoneForwardingConfigNameServerTarget]] = js.undefined
}
object ManagedZoneForwardingConfig {
  
  inline def apply(): ManagedZoneForwardingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZoneForwardingConfig]
  }
  
  extension [Self <: ManagedZoneForwardingConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTargetNameServers(value: js.Array[ManagedZoneForwardingConfigNameServerTarget]): Self = StObject.set(x, "targetNameServers", value.asInstanceOf[js.Any])
    
    inline def setTargetNameServersUndefined: Self = StObject.set(x, "targetNameServers", js.undefined)
    
    inline def setTargetNameServersVarargs(value: ManagedZoneForwardingConfigNameServerTarget*): Self = StObject.set(x, "targetNameServers", js.Array(value :_*))
  }
}
