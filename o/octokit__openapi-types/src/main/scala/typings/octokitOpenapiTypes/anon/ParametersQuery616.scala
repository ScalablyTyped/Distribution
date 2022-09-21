package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery616 extends StObject {
  
  var parameters: Query616
  
  var responses: `200ContentApplicationjsonApplicationvndgithubv3starjson`
}
object ParametersQuery616 {
  
  inline def apply(parameters: Query616, responses: `200ContentApplicationjsonApplicationvndgithubv3starjson`): ParametersQuery616 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery616]
  }
  
  extension [Self <: ParametersQuery616](x: Self) {
    
    inline def setParameters(value: Query616): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonApplicationvndgithubv3starjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
