package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedZoneDnsSecConfig extends StObject {
  
  /** Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed while the state is OFF. */
  var defaultKeySpecs: js.UndefOr[js.Array[DnsKeySpec]] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF. */
  var nonExistence: js.UndefOr[String] = js.undefined
  
  /** Specifies whether DNSSEC is enabled, and what mode it is in. */
  var state: js.UndefOr[String] = js.undefined
}
object ManagedZoneDnsSecConfig {
  
  inline def apply(): ManagedZoneDnsSecConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZoneDnsSecConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedZoneDnsSecConfig] (val x: Self) extends AnyVal {
    
    inline def setDefaultKeySpecs(value: js.Array[DnsKeySpec]): Self = StObject.set(x, "defaultKeySpecs", value.asInstanceOf[js.Any])
    
    inline def setDefaultKeySpecsUndefined: Self = StObject.set(x, "defaultKeySpecs", js.undefined)
    
    inline def setDefaultKeySpecsVarargs(value: DnsKeySpec*): Self = StObject.set(x, "defaultKeySpecs", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNonExistence(value: String): Self = StObject.set(x, "nonExistence", value.asInstanceOf[js.Any])
    
    inline def setNonExistenceUndefined: Self = StObject.set(x, "nonExistence", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
