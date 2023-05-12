package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters641 extends StObject {
  
  var parameters: `641`
  
  var responses: `200Content497Headers25`
}
object Parameters641 {
  
  inline def apply(parameters: `641`, responses: `200Content497Headers25`): Parameters641 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters641]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters641] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `641`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content497Headers25`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
