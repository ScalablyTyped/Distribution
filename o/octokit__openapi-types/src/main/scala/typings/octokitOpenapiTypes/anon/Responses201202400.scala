package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201202400 extends StObject {
  
  var parameters: `472`
  
  var requestBody: Content190
  
  var responses: `201202400`
}
object Responses201202400 {
  
  inline def apply(parameters: `472`, requestBody: Content190, responses: `201202400`): Responses201202400 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201202400]
  }
  
  extension [Self <: Responses201202400](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content190): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
