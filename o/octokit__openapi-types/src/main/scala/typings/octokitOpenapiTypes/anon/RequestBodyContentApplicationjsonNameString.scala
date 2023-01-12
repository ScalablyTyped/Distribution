package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNameString extends StObject {
  
  var parameters: Path126
  
  var requestBody: ContentApplicationjsonNameString
  
  var responses: `200Content127`
}
object RequestBodyContentApplicationjsonNameString {
  
  inline def apply(parameters: Path126, requestBody: ContentApplicationjsonNameString, responses: `200Content127`): RequestBodyContentApplicationjsonNameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonNameString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path126): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content127`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
