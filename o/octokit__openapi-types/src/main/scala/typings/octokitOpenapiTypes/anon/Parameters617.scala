package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters617 extends StObject {
  
  var parameters: `617`
  
  var responses: `200Content618`
}
object Parameters617 {
  
  inline def apply(parameters: `617`, responses: `200Content618`): Parameters617 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters617]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters617] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `617`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content618`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
