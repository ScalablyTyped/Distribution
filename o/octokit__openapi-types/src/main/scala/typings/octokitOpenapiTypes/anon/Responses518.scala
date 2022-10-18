package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses518 extends StObject {
  
  var parameters: `395`
  
  var requestBody: Content135
  
  var responses: `518`
}
object Responses518 {
  
  inline def apply(parameters: `395`, requestBody: Content135, responses: `518`): Responses518 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses518]
  }
  
  extension [Self <: Responses518](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content135): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `518`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
