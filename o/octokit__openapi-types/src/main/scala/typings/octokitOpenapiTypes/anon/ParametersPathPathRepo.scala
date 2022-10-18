package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPathRepo extends StObject {
  
  var parameters: PathPathRepo
  
  var responses: `200302403`
}
object ParametersPathPathRepo {
  
  inline def apply(parameters: PathPathRepo, responses: `200302403`): ParametersPathPathRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPathRepo]
  }
  
  extension [Self <: ParametersPathPathRepo](x: Self) {
    
    inline def setParameters(value: PathPathRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200302403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
