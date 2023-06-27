package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters165Responses200Content74 extends StObject {
  
  var parameters: `165`
  
  var responses: `200Content74`
}
object Parameters165Responses200Content74 {
  
  inline def apply(parameters: `165`, responses: `200Content74`): Parameters165Responses200Content74 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters165Responses200Content74]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters165Responses200Content74] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content74`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
