package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters286 extends StObject {
  
  var parameters: `286`
  
  var responses: `200Content56400`
}
object Parameters286 {
  
  inline def apply(parameters: `286`, responses: `200Content56400`): Parameters286 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters286]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters286] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `286`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content56400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
