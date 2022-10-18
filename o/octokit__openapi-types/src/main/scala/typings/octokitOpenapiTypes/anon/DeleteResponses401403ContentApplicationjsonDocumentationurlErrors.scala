package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses401403ContentApplicationjsonDocumentationurlErrors extends StObject {
  
  var delete: Responses401403ContentApplicationjsonDocumentationurlErrors
  
  var get: ParametersPath384
  
  var patch: Responses200Content385304
}
object DeleteResponses401403ContentApplicationjsonDocumentationurlErrors {
  
  inline def apply(
    delete: Responses401403ContentApplicationjsonDocumentationurlErrors,
    get: ParametersPath384,
    patch: Responses200Content385304
  ): DeleteResponses401403ContentApplicationjsonDocumentationurlErrors = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses401403ContentApplicationjsonDocumentationurlErrors]
  }
  
  extension [Self <: DeleteResponses401403ContentApplicationjsonDocumentationurlErrors](x: Self) {
    
    inline def setDelete(value: Responses401403ContentApplicationjsonDocumentationurlErrors): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath384): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content385304): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
