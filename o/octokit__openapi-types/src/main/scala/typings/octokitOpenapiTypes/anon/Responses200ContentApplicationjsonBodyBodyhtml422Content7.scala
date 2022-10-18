package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodyBodyhtml422Content7 extends StObject {
  
  var parameters: PathReviewid
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `200ContentApplicationjsonBodyBodyhtml422Content7`
}
object Responses200ContentApplicationjsonBodyBodyhtml422Content7 {
  
  inline def apply(
    parameters: PathReviewid,
    requestBody: ContentApplicationjsonBodyString,
    responses: `200ContentApplicationjsonBodyBodyhtml422Content7`
  ): Responses200ContentApplicationjsonBodyBodyhtml422Content7 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodyBodyhtml422Content7]
  }
  
  extension [Self <: Responses200ContentApplicationjsonBodyBodyhtml422Content7](x: Self) {
    
    inline def setParameters(value: PathReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodyBodyhtml422Content7`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
