package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolicyMappings extends StObject {
  
  var mappings: js.Array[PolicyMapping]
}
object IPolicyMappings {
  
  inline def apply(mappings: js.Array[PolicyMapping]): IPolicyMappings = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPolicyMappings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPolicyMappings] (val x: Self) extends AnyVal {
    
    inline def setMappings(value: js.Array[PolicyMapping]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsVarargs(value: PolicyMapping*): Self = StObject.set(x, "mappings", js.Array(value*))
  }
}
