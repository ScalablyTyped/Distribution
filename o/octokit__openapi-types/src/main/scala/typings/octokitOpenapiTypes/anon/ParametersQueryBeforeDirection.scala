package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryBeforeDirection extends StObject {
  
  var parameters: QueryBeforeDirection
  
  var responses: `200Content433`
}
object ParametersQueryBeforeDirection {
  
  inline def apply(parameters: QueryBeforeDirection, responses: `200Content433`): ParametersQueryBeforeDirection = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryBeforeDirection]
  }
  
  extension [Self <: ParametersQueryBeforeDirection](x: Self) {
    
    inline def setParameters(value: QueryBeforeDirection): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content433`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
