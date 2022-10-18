package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201529 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: ContentApplicationjson145
  
  var responses: `201529`
}
object Responses201529 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, requestBody: ContentApplicationjson145, responses: `201529`): Responses201529 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201529]
  }
  
  extension [Self <: Responses201529](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson145): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201529`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
