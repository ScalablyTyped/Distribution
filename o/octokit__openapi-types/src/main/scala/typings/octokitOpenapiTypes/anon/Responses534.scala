package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses534 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: Content153
  
  var responses: `534`
}
object Responses534 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, requestBody: Content153, responses: `534`): Responses534 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses534]
  }
  
  extension [Self <: Responses534](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content153): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `534`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
