package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content373 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberOrg
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `200Content373`
}
object Responses200Content373 {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumberOrg,
    requestBody: ContentApplicationjsonBodyString,
    responses: `200Content373`
  ): Responses200Content373 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content373]
  }
  
  extension [Self <: Responses200Content373](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content373`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
