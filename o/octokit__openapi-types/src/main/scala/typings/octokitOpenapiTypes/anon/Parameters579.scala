package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters579 extends StObject {
  
  var parameters: `579`
  
  var responses: `200Content580`
}
object Parameters579 {
  
  inline def apply(parameters: `579`, responses: `200Content580`): Parameters579 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters579]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters579] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `579`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content580`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
