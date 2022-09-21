package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedZoneCloudLoggingConfig extends StObject {
  
  /** If set, enable query logging for this ManagedZone. False by default, making logging opt-in. */
  var enableLogging: js.UndefOr[Boolean] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object ManagedZoneCloudLoggingConfig {
  
  inline def apply(): ManagedZoneCloudLoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZoneCloudLoggingConfig]
  }
  
  extension [Self <: ManagedZoneCloudLoggingConfig](x: Self) {
    
    inline def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
