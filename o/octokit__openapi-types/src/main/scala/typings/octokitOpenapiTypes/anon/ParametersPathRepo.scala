package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepo extends StObject {
  
  var parameters: PathRepo
  
  var responses: `200Content127`
}
object ParametersPathRepo {
  
  inline def apply(parameters: PathRepo, responses: `200Content127`): ParametersPathRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content127`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
