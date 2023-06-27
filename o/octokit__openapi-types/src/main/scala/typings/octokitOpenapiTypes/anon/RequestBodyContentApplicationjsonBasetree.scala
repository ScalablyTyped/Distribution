package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBasetree extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonBasetree
  
  var responses: `201Content297`
}
object RequestBodyContentApplicationjsonBasetree {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonBasetree, responses: `201Content297`): RequestBodyContentApplicationjsonBasetree = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBasetree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonBasetree] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBasetree): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content297`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
