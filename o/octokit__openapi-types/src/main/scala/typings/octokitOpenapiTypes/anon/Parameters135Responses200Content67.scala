package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters135Responses200Content67 extends StObject {
  
  var parameters: `135`
  
  var responses: `200Content67`
}
object Parameters135Responses200Content67 {
  
  inline def apply(parameters: `135`, responses: `200Content67`): Parameters135Responses200Content67 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters135Responses200Content67]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters135Responses200Content67] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content67`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
