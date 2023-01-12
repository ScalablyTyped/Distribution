package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonAllowupdatebranch extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjsonAllowautomerge
  
  var responses: `201ContentApplicationjsonAllowupdatebranch`
}
object Responses201ContentApplicationjsonAllowupdatebranch {
  
  inline def apply(
    parameters: `433`,
    requestBody: ContentApplicationjsonAllowautomerge,
    responses: `201ContentApplicationjsonAllowupdatebranch`
  ): Responses201ContentApplicationjsonAllowupdatebranch = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonAllowupdatebranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonAllowupdatebranch] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowautomerge): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAllowupdatebranch`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
