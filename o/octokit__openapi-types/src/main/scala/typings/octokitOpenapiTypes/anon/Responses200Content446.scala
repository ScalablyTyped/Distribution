package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content446 extends StObject {
  
  var parameters: PathCheckrunidOwner
  
  var requestBody: Content99
  
  var responses: `200Content446`
}
object Responses200Content446 {
  
  inline def apply(parameters: PathCheckrunidOwner, requestBody: Content99, responses: `200Content446`): Responses200Content446 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content446]
  }
  
  extension [Self <: Responses200Content446](x: Self) {
    
    inline def setParameters(value: PathCheckrunidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content99): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content446`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
