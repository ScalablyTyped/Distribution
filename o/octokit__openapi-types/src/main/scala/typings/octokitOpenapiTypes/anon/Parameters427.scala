package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters427 extends StObject {
  
  var parameters: `427`
  
  var responses: `200Content428`
}
object Parameters427 {
  
  inline def apply(parameters: `427`, responses: `200Content428`): Parameters427 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters427]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters427] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `427`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content428`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
