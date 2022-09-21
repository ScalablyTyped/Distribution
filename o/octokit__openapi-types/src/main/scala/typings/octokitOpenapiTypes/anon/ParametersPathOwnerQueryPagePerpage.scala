package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerQueryPagePerpage extends StObject {
  
  var parameters: PathOwnerQueryPagePerpage
  
  var responses: `200Content341`
}
object ParametersPathOwnerQueryPagePerpage {
  
  inline def apply(parameters: PathOwnerQueryPagePerpage, responses: `200Content341`): ParametersPathOwnerQueryPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerQueryPagePerpage]
  }
  
  extension [Self <: ParametersPathOwnerQueryPagePerpage](x: Self) {
    
    inline def setParameters(value: PathOwnerQueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content341`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
