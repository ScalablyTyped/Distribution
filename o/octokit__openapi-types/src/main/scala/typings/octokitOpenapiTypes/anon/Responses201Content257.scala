package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content257 extends StObject {
  
  var parameters: `141`
  
  var requestBody: js.UndefOr[Content256] = js.undefined
  
  var responses: `201Content257`
}
object Responses201Content257 {
  
  inline def apply(parameters: `141`, responses: `201Content257`): Responses201Content257 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content257]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201Content257] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content256): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201Content257`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
