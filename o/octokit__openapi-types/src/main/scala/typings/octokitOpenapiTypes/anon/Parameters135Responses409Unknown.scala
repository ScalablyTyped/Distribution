package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters135Responses409Unknown extends StObject {
  
  var parameters: `135`
  
  var responses: `409Unknown`
}
object Parameters135Responses409Unknown {
  
  inline def apply(parameters: `135`, responses: `409Unknown`): Parameters135Responses409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters135Responses409Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters135Responses409Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
