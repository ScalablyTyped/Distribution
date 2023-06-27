package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters609 extends StObject {
  
  var parameters: `609`
  
  var responses: `404Content41`
}
object Parameters609 {
  
  inline def apply(parameters: `609`, responses: `404Content41`): Parameters609 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters609]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters609] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `609`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
