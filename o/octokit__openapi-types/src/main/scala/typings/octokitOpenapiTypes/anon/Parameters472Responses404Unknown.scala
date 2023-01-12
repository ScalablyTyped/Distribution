package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters472Responses404Unknown extends StObject {
  
  var parameters: `472`
  
  var responses: `404Unknown`
}
object Parameters472Responses404Unknown {
  
  inline def apply(parameters: `472`, responses: `404Unknown`): Parameters472Responses404Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters472Responses404Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters472Responses404Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
