package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses403ContentApplicationjsonErrors extends StObject {
  
  /** Delete a project card */
  var delete: Responses403ContentApplicationjsonErrors
  
  /** Get a project card */
  var get: ParametersPathCardid
  
  /** Update an existing project card */
  var patch: Responses401403404422
}
object DeleteResponses403ContentApplicationjsonErrors {
  
  inline def apply(
    delete: Responses403ContentApplicationjsonErrors,
    get: ParametersPathCardid,
    patch: Responses401403404422
  ): DeleteResponses403ContentApplicationjsonErrors = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses403ContentApplicationjsonErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses403ContentApplicationjsonErrors] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses403ContentApplicationjsonErrors): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCardid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses401403404422): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
