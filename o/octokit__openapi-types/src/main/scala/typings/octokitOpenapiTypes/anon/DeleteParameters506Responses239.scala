package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters506Responses239 extends StObject {
  
  var delete: Parameters506Responses239
  
  var patch: Responses200Content508422
}
object DeleteParameters506Responses239 {
  
  inline def apply(delete: Parameters506Responses239, patch: Responses200Content508422): DeleteParameters506Responses239 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters506Responses239]
  }
  
  extension [Self <: DeleteParameters506Responses239](x: Self) {
    
    inline def setDelete(value: Parameters506Responses239): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content508422): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
