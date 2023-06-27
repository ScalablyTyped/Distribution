package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201404422503 extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonTfvcproject
  
  var responses: `201404422503`
}
object Responses201404422503 {
  
  inline def apply(parameters: `639`, requestBody: ContentApplicationjsonTfvcproject, responses: `201404422503`): Responses201404422503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201404422503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201404422503] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTfvcproject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
