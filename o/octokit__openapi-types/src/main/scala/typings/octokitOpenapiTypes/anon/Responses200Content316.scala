package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content316 extends StObject {
  
  var parameters: Path317
  
  var requestBody: ContentApplicationjsonNameRestrictedtoworkflows
  
  var responses: `200Content316`
}
object Responses200Content316 {
  
  inline def apply(
    parameters: Path317,
    requestBody: ContentApplicationjsonNameRestrictedtoworkflows,
    responses: `200Content316`
  ): Responses200Content316 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content316]
  }
  
  extension [Self <: Responses200Content316](x: Self) {
    
    inline def setParameters(value: Path317): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameRestrictedtoworkflows): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content316`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
