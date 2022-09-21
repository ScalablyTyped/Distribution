package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200409 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content88
  
  var responses: `200409`
}
object Responses200409 {
  
  inline def apply(parameters: `144`, requestBody: Content88, responses: `200409`): Responses200409 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200409]
  }
  
  extension [Self <: Responses200409](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content88): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
