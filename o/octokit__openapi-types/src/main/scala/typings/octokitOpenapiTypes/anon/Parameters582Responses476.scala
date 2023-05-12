package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters582Responses476 extends StObject {
  
  var parameters: `582`
  
  var responses: `476`
}
object Parameters582Responses476 {
  
  inline def apply(parameters: `582`, responses: `476`): Parameters582Responses476 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters582Responses476]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters582Responses476] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `476`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
