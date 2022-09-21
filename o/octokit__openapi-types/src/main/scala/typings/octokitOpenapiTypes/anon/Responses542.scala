package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses542 extends StObject {
  
  var parameters: `491`
  
  var requestBody: Content254
  
  var responses: `542`
}
object Responses542 {
  
  inline def apply(parameters: `491`, requestBody: Content254, responses: `542`): Responses542 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses542]
  }
  
  extension [Self <: Responses542](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content254): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `542`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
