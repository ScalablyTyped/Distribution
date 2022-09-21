package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryBaseDirection extends StObject {
  
  var parameters: QueryBaseDirection
  
  var responses: `200Content523304Unknown`
}
object ParametersQueryBaseDirection {
  
  inline def apply(parameters: QueryBaseDirection, responses: `200Content523304Unknown`): ParametersQueryBaseDirection = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryBaseDirection]
  }
  
  extension [Self <: ParametersQueryBaseDirection](x: Self) {
    
    inline def setParameters(value: QueryBaseDirection): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content523304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
