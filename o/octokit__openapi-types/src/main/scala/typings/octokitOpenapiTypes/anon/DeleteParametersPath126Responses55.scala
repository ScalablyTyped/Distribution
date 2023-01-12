package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath126Responses55 extends StObject {
  
  var delete: ParametersPath126Responses55
  
  var get: ParametersPath126
  
  var patch: RequestBodyContentApplicationjsonNameString
}
object DeleteParametersPath126Responses55 {
  
  inline def apply(
    delete: ParametersPath126Responses55,
    get: ParametersPath126,
    patch: RequestBodyContentApplicationjsonNameString
  ): DeleteParametersPath126Responses55 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath126Responses55]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPath126Responses55] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPath126Responses55): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath126): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonNameString): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
