package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameQueryPagePerpage extends StObject {
  
  var parameters: PathSecretnameQueryPagePerpage
  
  var responses: `200ContentApplicationjsonRepositoriesArray`
}
object ParametersPathSecretnameQueryPagePerpage {
  
  inline def apply(
    parameters: PathSecretnameQueryPagePerpage,
    responses: `200ContentApplicationjsonRepositoriesArray`
  ): ParametersPathSecretnameQueryPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameQueryPagePerpage]
  }
  
  extension [Self <: ParametersPathSecretnameQueryPagePerpage](x: Self) {
    
    inline def setParameters(value: PathSecretnameQueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
