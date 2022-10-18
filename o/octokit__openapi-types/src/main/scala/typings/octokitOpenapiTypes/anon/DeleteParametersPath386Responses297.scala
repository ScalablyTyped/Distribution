package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath386Responses297 extends StObject {
  
  var delete: ParametersPath386Responses297
  
  var get: ParametersPath386
  
  var patch: Responses200Content387304
}
object DeleteParametersPath386Responses297 {
  
  inline def apply(delete: ParametersPath386Responses297, get: ParametersPath386, patch: Responses200Content387304): DeleteParametersPath386Responses297 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath386Responses297]
  }
  
  extension [Self <: DeleteParametersPath386Responses297](x: Self) {
    
    inline def setDelete(value: ParametersPath386Responses297): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath386): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content387304): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
