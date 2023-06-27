package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters390 extends StObject {
  
  var parameters: `390`
  
  var responses: `200Content138404`
}
object Parameters390 {
  
  inline def apply(parameters: `390`, responses: `200Content138404`): Parameters390 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters390]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters390] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `390`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content138404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
