package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepo extends StObject {
  
  var parameters: PathHookidOwnerRepo
  
  var responses: `200588`
}
object ParametersPathHookidOwnerRepo {
  
  inline def apply(parameters: PathHookidOwnerRepo, responses: `200588`): ParametersPathHookidOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200588`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
