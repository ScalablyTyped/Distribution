package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304401403422503 extends StObject {
  
  var parameters: Path386
  
  var requestBody: Content74
  
  var responses: `304401403422503`
}
object Responses304401403422503 {
  
  inline def apply(parameters: Path386, requestBody: Content74, responses: `304401403422503`): Responses304401403422503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304401403422503]
  }
  
  extension [Self <: Responses304401403422503](x: Self) {
    
    inline def setParameters(value: Path386): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content74): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
