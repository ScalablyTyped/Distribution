package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters179 extends StObject {
  
  var parameters: `179`
  
  var responses: `200ContentApplicationjsonWorkflowruns`
}
object Parameters179 {
  
  inline def apply(parameters: `179`, responses: `200ContentApplicationjsonWorkflowruns`): Parameters179 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters179]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters179] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `179`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
