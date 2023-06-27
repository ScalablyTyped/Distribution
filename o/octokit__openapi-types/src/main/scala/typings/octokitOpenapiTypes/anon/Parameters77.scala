package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters77 extends StObject {
  
  var parameters: `77`
  
  var responses: `200ContentApplicationjsonVariables`
}
object Parameters77 {
  
  inline def apply(parameters: `77`, responses: `200ContentApplicationjsonVariables`): Parameters77 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters77]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters77] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `77`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonVariables`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
