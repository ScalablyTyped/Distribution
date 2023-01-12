package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathNameOwnerRepoResponses extends StObject {
  
  var delete: ParametersPathNameOwnerRepoResponses
  
  var get: ParametersPathNameOwnerRepo
  
  var patch: RequestBodyContentApplicationjsonDescriptionNewname
}
object DeleteParametersPathNameOwnerRepoResponses {
  
  inline def apply(
    delete: ParametersPathNameOwnerRepoResponses,
    get: ParametersPathNameOwnerRepo,
    patch: RequestBodyContentApplicationjsonDescriptionNewname
  ): DeleteParametersPathNameOwnerRepoResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathNameOwnerRepoResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathNameOwnerRepoResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathNameOwnerRepoResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathNameOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonDescriptionNewname): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
