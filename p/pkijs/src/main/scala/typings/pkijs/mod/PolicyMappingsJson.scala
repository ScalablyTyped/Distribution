package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyMappingsJson extends StObject {
  
  var mappings: js.Array[PolicyMappingJson]
}
object PolicyMappingsJson {
  
  inline def apply(mappings: js.Array[PolicyMappingJson]): PolicyMappingsJson = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyMappingsJson]
  }
  
  extension [Self <: PolicyMappingsJson](x: Self) {
    
    inline def setMappings(value: js.Array[PolicyMappingJson]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsVarargs(value: PolicyMappingJson*): Self = StObject.set(x, "mappings", js.Array(value*))
  }
}
