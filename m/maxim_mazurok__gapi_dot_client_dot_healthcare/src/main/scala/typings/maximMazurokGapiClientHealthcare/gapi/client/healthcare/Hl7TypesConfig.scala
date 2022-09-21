package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hl7TypesConfig extends StObject {
  
  /** The HL7v2 type definitions. */
  var `type`: js.UndefOr[js.Array[Type]] = js.undefined
  
  /** The version selectors that this config applies to. A message must match ALL version sources to apply. */
  var version: js.UndefOr[js.Array[VersionSource]] = js.undefined
}
object Hl7TypesConfig {
  
  inline def apply(): Hl7TypesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hl7TypesConfig]
  }
  
  extension [Self <: Hl7TypesConfig](x: Self) {
    
    inline def setType(value: js.Array[Type]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: Type*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setVersion(value: js.Array[VersionSource]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: VersionSource*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
