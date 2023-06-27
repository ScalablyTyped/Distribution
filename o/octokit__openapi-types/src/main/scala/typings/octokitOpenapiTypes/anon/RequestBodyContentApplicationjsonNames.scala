package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNames extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonNames
  
  var responses: `200Content428404`
}
object RequestBodyContentApplicationjsonNames {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonNames, responses: `200Content428404`): RequestBodyContentApplicationjsonNames = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonNames] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNames): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content428404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
