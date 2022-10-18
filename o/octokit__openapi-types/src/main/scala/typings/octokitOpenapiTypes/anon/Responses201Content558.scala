package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content558 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonMaintainercanmodify
  
  var responses: `201Content558`
}
object Responses201Content558 {
  
  inline def apply(
    parameters: `395`,
    requestBody: ContentApplicationjsonMaintainercanmodify,
    responses: `201Content558`
  ): Responses201Content558 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content558]
  }
  
  extension [Self <: Responses201Content558](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMaintainercanmodify): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content558`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
