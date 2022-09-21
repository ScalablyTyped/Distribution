package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidOwnerRepo extends StObject {
  
  var parameters: PathKeyidOwnerRepo
  
  var responses: `200555`
}
object ParametersPathKeyidOwnerRepo {
  
  inline def apply(parameters: PathKeyidOwnerRepo, responses: `200555`): ParametersPathKeyidOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidOwnerRepo]
  }
  
  extension [Self <: ParametersPathKeyidOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathKeyidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200555`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
