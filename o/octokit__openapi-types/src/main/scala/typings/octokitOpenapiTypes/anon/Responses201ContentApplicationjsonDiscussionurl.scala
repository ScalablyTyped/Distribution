package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonDiscussionurl extends StObject {
  
  var parameters: PathDiscussionnumber
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `201ContentApplicationjsonDiscussionurl`
}
object Responses201ContentApplicationjsonDiscussionurl {
  
  inline def apply(
    parameters: PathDiscussionnumber,
    requestBody: ContentApplicationjsonBodyString,
    responses: `201ContentApplicationjsonDiscussionurl`
  ): Responses201ContentApplicationjsonDiscussionurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonDiscussionurl]
  }
  
  extension [Self <: Responses201ContentApplicationjsonDiscussionurl](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDiscussionurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
