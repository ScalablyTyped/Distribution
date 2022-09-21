package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonAllowupdatebranch extends StObject {
  
  var parameters: PathOrgString
  
  var requestBody: ContentApplicationjsonAllowautomerge
  
  var responses: `201ContentApplicationjsonAllowupdatebranch`
}
object Responses201ContentApplicationjsonAllowupdatebranch {
  
  inline def apply(
    parameters: PathOrgString,
    requestBody: ContentApplicationjsonAllowautomerge,
    responses: `201ContentApplicationjsonAllowupdatebranch`
  ): Responses201ContentApplicationjsonAllowupdatebranch = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonAllowupdatebranch]
  }
  
  extension [Self <: Responses201ContentApplicationjsonAllowupdatebranch](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowautomerge): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAllowupdatebranch`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
