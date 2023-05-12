package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters96 extends StObject {
  
  var parameters: `96`
  
  var responses: `7`
}
object Parameters96 {
  
  inline def apply(parameters: `96`, responses: `7`): Parameters96 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters96]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters96] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `96`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `7`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
