package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedZoneReverseLookupConfig extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
}
object ManagedZoneReverseLookupConfig {
  
  inline def apply(): ManagedZoneReverseLookupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZoneReverseLookupConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedZoneReverseLookupConfig] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
