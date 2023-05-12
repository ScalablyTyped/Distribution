package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters386 extends StObject {
  
  var parameters: `386`
  
  var responses: `200Content32304`
}
object Parameters386 {
  
  inline def apply(parameters: `386`, responses: `200Content32304`): Parameters386 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters386]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters386] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `386`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content32304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
