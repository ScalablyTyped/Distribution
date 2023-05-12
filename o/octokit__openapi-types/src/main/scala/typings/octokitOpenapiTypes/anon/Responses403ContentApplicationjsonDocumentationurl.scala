package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403ContentApplicationjsonDocumentationurl extends StObject {
  
  var parameters: PathProjectid
  
  var requestBody: js.UndefOr[Content126] = js.undefined
  
  var responses: `403ContentApplicationjsonDocumentationurl`
}
object Responses403ContentApplicationjsonDocumentationurl {
  
  inline def apply(parameters: PathProjectid, responses: `403ContentApplicationjsonDocumentationurl`): Responses403ContentApplicationjsonDocumentationurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403ContentApplicationjsonDocumentationurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403ContentApplicationjsonDocumentationurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content126): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
