package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerPathRepo extends StObject {
  
  var parameters: PathOwnerPathRepo
  
  var responses: `200302403`
}
object ParametersPathOwnerPathRepo {
  
  inline def apply(parameters: PathOwnerPathRepo, responses: `200302403`): ParametersPathOwnerPathRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerPathRepo]
  }
  
  extension [Self <: ParametersPathOwnerPathRepo](x: Self) {
    
    inline def setParameters(value: PathOwnerPathRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200302403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
