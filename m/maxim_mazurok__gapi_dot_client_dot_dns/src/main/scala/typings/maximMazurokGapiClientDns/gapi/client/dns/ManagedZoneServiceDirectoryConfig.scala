package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedZoneServiceDirectoryConfig extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** Contains information about the namespace associated with the zone. */
  var namespace: js.UndefOr[ManagedZoneServiceDirectoryConfigNamespace] = js.undefined
}
object ManagedZoneServiceDirectoryConfig {
  
  inline def apply(): ManagedZoneServiceDirectoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZoneServiceDirectoryConfig]
  }
  
  extension [Self <: ManagedZoneServiceDirectoryConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNamespace(value: ManagedZoneServiceDirectoryConfigNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
