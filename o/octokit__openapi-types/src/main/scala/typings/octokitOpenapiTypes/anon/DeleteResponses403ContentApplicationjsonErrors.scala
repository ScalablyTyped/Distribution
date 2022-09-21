package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses403ContentApplicationjsonErrors extends StObject {
  
  var delete: Responses403ContentApplicationjsonErrors
  
  var get: ParametersPathCardid
  
  var patch: RequestBodyContentApplicationjsonArchived
}
object DeleteResponses403ContentApplicationjsonErrors {
  
  inline def apply(
    delete: Responses403ContentApplicationjsonErrors,
    get: ParametersPathCardid,
    patch: RequestBodyContentApplicationjsonArchived
  ): DeleteResponses403ContentApplicationjsonErrors = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses403ContentApplicationjsonErrors]
  }
  
  extension [Self <: DeleteResponses403ContentApplicationjsonErrors](x: Self) {
    
    inline def setDelete(value: Responses403ContentApplicationjsonErrors): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCardid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonArchived): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
