package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content572 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonDiscussioncategoryname
  
  var responses: `201Content572`
}
object Responses201Content572 {
  
  inline def apply(
    parameters: `395`,
    requestBody: ContentApplicationjsonDiscussioncategoryname,
    responses: `201Content572`
  ): Responses201Content572 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content572]
  }
  
  extension [Self <: Responses201Content572](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDiscussioncategoryname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content572`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
