package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryTask extends StObject {
  
  var parameters: QueryTask
  
  var responses: `200Content87Headers`
}
object ParametersQueryTask {
  
  inline def apply(parameters: QueryTask, responses: `200Content87Headers`): ParametersQueryTask = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryTask]
  }
  
  extension [Self <: ParametersQueryTask](x: Self) {
    
    inline def setParameters(value: QueryTask): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content87Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
