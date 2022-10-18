package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content376 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberOrg
  
  var requestBody: ContentApplicationjson62
  
  var responses: `200Content376`
}
object Responses200Content376 {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumberOrg,
    requestBody: ContentApplicationjson62,
    responses: `200Content376`
  ): Responses200Content376 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content376]
  }
  
  extension [Self <: Responses200Content376](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content376`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
