package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepo extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `301`
}
object ParametersPathOwnerRepo {
  
  inline def apply(parameters: PathOwnerRepo, responses: `301`): ParametersPathOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepo]
  }
  
  extension [Self <: ParametersPathOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
