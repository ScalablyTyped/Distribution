package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content111 extends StObject {
  
  var parameters: PathDiscussionnumber
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `201Content111`
}
object Responses201Content111 {
  
  inline def apply(
    parameters: PathDiscussionnumber,
    requestBody: ContentApplicationjsonBody,
    responses: `201Content111`
  ): Responses201Content111 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content111]
  }
  
  extension [Self <: Responses201Content111](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content111`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
