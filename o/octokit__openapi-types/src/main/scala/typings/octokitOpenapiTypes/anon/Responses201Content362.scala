package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content362 extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjsonAutoinit
  
  var responses: `201Content362`
}
object Responses201Content362 {
  
  inline def apply(parameters: `303`, requestBody: ContentApplicationjsonAutoinit, responses: `201Content362`): Responses201Content362 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content362]
  }
  
  extension [Self <: Responses201Content362](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutoinit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content362`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
