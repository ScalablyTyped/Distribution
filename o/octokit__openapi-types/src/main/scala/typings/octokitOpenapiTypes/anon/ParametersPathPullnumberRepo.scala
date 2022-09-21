package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberRepo extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var responses: `200304404500`
}
object ParametersPathPullnumberRepo {
  
  inline def apply(parameters: PathPullnumberRepo, responses: `200304404500`): ParametersPathPullnumberRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberRepo]
  }
  
  extension [Self <: ParametersPathPullnumberRepo](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
