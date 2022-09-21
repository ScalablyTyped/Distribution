package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content47404Content55 extends StObject {
  
  var parameters: Path602
  
  var requestBody: ContentApplicationjsonKeyidSelectedrepositoryids
  
  var responses: `201Content47404Content55`
}
object Responses201Content47404Content55 {
  
  inline def apply(
    parameters: Path602,
    requestBody: ContentApplicationjsonKeyidSelectedrepositoryids,
    responses: `201Content47404Content55`
  ): Responses201Content47404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content47404Content55]
  }
  
  extension [Self <: Responses201Content47404Content55](x: Self) {
    
    inline def setParameters(value: Path602): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyidSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content47404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
