package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameOwnerRepo extends StObject {
  
  var parameters: PathNameOwnerRepo
  
  var responses: `200281`
}
object ParametersPathNameOwnerRepo {
  
  inline def apply(parameters: PathNameOwnerRepo, responses: `200281`): ParametersPathNameOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameOwnerRepo]
  }
  
  extension [Self <: ParametersPathNameOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathNameOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200281`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
