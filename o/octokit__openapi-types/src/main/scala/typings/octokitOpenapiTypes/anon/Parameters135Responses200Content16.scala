package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters135Responses200Content16 extends StObject {
  
  var parameters: `135`
  
  var responses: `200Content16`
}
object Parameters135Responses200Content16 {
  
  inline def apply(parameters: `135`, responses: `200Content16`): Parameters135Responses200Content16 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters135Responses200Content16]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters135Responses200Content16] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content16`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
