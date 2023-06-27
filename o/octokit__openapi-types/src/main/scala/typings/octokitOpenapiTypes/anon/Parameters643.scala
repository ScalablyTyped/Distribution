package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters643 extends StObject {
  
  var parameters: `643`
  
  var responses: `200ContentApplicationjsonTotalcountWorkflowruns`
}
object Parameters643 {
  
  inline def apply(parameters: `643`, responses: `200ContentApplicationjsonTotalcountWorkflowruns`): Parameters643 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters643]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters643] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `643`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
