package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDueon extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonDueon
  
  var responses: `201Content351`
}
object RequestBodyContentApplicationjsonDueon {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonDueon, responses: `201Content351`): RequestBodyContentApplicationjsonDueon = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDueon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonDueon] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDueon): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content351`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
