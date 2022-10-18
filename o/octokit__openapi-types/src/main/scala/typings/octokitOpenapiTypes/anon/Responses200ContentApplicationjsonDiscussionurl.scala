package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonDiscussionurl extends StObject {
  
  var parameters: PathCommentnumber
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `200ContentApplicationjsonDiscussionurl`
}
object Responses200ContentApplicationjsonDiscussionurl {
  
  inline def apply(
    parameters: PathCommentnumber,
    requestBody: ContentApplicationjsonBodyString,
    responses: `200ContentApplicationjsonDiscussionurl`
  ): Responses200ContentApplicationjsonDiscussionurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonDiscussionurl]
  }
  
  extension [Self <: Responses200ContentApplicationjsonDiscussionurl](x: Self) {
    
    inline def setParameters(value: PathCommentnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDiscussionurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
