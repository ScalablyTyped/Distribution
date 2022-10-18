package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBodyTitle extends StObject {
  
  var parameters: PathDiscussionnumber
  
  var requestBody: ContentApplicationjsonBodyTitle
  
  var responses: `200ContentApplicationjsonCommentscount`
}
object RequestBodyContentApplicationjsonBodyTitle {
  
  inline def apply(
    parameters: PathDiscussionnumber,
    requestBody: ContentApplicationjsonBodyTitle,
    responses: `200ContentApplicationjsonCommentscount`
  ): RequestBodyContentApplicationjsonBodyTitle = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBodyTitle]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBodyTitle](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
