package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery650 extends StObject {
  
  var parameters: Query650
  
  var responses: `200ContentApplicationjsonApplicationvndgithubv3starjson`
}
object ParametersQuery650 {
  
  inline def apply(parameters: Query650, responses: `200ContentApplicationjsonApplicationvndgithubv3starjson`): ParametersQuery650 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery650]
  }
  
  extension [Self <: ParametersQuery650](x: Self) {
    
    inline def setParameters(value: Query650): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonApplicationvndgithubv3starjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
