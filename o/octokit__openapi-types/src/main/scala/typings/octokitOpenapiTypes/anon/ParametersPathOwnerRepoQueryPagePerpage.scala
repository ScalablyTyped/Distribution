package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoQueryPagePerpage extends StObject {
  
  var parameters: PathOwnerRepoQueryPagePerpage
  
  var responses: `200ContentApplicationjsonNames`
}
object ParametersPathOwnerRepoQueryPagePerpage {
  
  inline def apply(parameters: PathOwnerRepoQueryPagePerpage, responses: `200ContentApplicationjsonNames`): ParametersPathOwnerRepoQueryPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoQueryPagePerpage]
  }
  
  extension [Self <: ParametersPathOwnerRepoQueryPagePerpage](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoQueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNames`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
