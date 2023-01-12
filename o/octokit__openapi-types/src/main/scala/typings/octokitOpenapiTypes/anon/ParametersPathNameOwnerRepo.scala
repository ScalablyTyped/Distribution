package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameOwnerRepo extends StObject {
  
  var parameters: PathNameOwnerRepo
  
  var responses: `200275`
}
object ParametersPathNameOwnerRepo {
  
  inline def apply(parameters: PathNameOwnerRepo, responses: `200275`): ParametersPathNameOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200275`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
