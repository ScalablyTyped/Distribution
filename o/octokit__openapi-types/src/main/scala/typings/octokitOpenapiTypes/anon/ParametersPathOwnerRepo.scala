package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepo extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `200Content22`
}
object ParametersPathOwnerRepo {
  
  inline def apply(parameters: PathOwnerRepo, responses: `200Content22`): ParametersPathOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepo]
  }
  
  extension [Self <: ParametersPathOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content22`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
