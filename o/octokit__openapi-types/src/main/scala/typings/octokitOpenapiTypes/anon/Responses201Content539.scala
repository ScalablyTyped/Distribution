package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content539 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonColorDescriptionName
  
  var responses: `201Content539`
}
object Responses201Content539 {
  
  inline def apply(
    parameters: `395`,
    requestBody: ContentApplicationjsonColorDescriptionName,
    responses: `201Content539`
  ): Responses201Content539 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content539]
  }
  
  extension [Self <: Responses201Content539](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonColorDescriptionName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content539`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
