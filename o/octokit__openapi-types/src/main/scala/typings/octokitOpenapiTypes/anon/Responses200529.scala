package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200529 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: ContentApplicationjsonAssigneesArray
  
  var responses: `200529`
}
object Responses200529 {
  
  inline def apply(
    parameters: PathIssuenumberOwnerRepo,
    requestBody: ContentApplicationjsonAssigneesArray,
    responses: `200529`
  ): Responses200529 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200529]
  }
  
  extension [Self <: Responses200529](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAssigneesArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200529`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
