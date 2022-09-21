package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters241Responses8 extends StObject {
  
  var delete: Parameters241Responses8
  
  var patch: RequestBodyContentApplicationjsonForce
}
object DeleteParameters241Responses8 {
  
  inline def apply(delete: Parameters241Responses8, patch: RequestBodyContentApplicationjsonForce): DeleteParameters241Responses8 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters241Responses8]
  }
  
  extension [Self <: DeleteParameters241Responses8](x: Self) {
    
    inline def setDelete(value: Parameters241Responses8): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonForce): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
