package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content449 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonAutotriggerchecks
  
  var responses: `200Content449`
}
object Responses200Content449 {
  
  inline def apply(
    parameters: `395`,
    requestBody: ContentApplicationjsonAutotriggerchecks,
    responses: `200Content449`
  ): Responses200Content449 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content449]
  }
  
  extension [Self <: Responses200Content449](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutotriggerchecks): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content449`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
