package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath135Responses62 extends StObject {
  
  var delete: ParametersPath135Responses62
  
  var get: ParametersPath135
  
  var patch: RequestBodyContentApplicationjsonNameString
}
object DeleteParametersPath135Responses62 {
  
  inline def apply(
    delete: ParametersPath135Responses62,
    get: ParametersPath135,
    patch: RequestBodyContentApplicationjsonNameString
  ): DeleteParametersPath135Responses62 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath135Responses62]
  }
  
  extension [Self <: DeleteParametersPath135Responses62](x: Self) {
    
    inline def setDelete(value: ParametersPath135Responses62): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath135): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonNameString): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
