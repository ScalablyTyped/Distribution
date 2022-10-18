package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422Content311 extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjsonCompany
  
  var responses: `422Content311`
}
object Responses422Content311 {
  
  inline def apply(parameters: `303`, requestBody: ContentApplicationjsonCompany, responses: `422Content311`): Responses422Content311 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422Content311]
  }
  
  extension [Self <: Responses422Content311](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCompany): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content311`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
