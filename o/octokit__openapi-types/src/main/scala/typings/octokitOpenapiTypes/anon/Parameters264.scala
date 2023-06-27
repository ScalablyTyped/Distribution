package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters264 extends StObject {
  
  var parameters: `264`
  
  var responses: `200Content265`
}
object Parameters264 {
  
  inline def apply(parameters: `264`, responses: `200Content265`): Parameters264 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters264]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters264] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `264`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content265`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
