package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonName extends StObject {
  
  var parameters: Path131
  
  var requestBody: ContentApplicationjsonName
  
  var responses: `200Content132`
}
object RequestBodyContentApplicationjsonName {
  
  inline def apply(parameters: Path131, requestBody: ContentApplicationjsonName, responses: `200Content132`): RequestBodyContentApplicationjsonName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path131): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content132`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
