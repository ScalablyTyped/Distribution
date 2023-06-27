package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201400403 extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonAssignees
  
  var responses: `201400403`
}
object Responses201400403 {
  
  inline def apply(parameters: `639`, requestBody: ContentApplicationjsonAssignees, responses: `201400403`): Responses201400403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201400403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201400403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAssignees): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
