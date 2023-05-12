package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses267 extends StObject {
  
  var parameters: `141`
  
  var requestBody: Content84
  
  var responses: `267`
}
object Responses267 {
  
  inline def apply(parameters: `141`, requestBody: Content84, responses: `267`): Responses267 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses267]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses267] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content84): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `267`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
