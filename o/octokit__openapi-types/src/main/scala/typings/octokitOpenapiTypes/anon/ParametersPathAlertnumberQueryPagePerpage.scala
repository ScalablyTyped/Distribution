package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumberQueryPagePerpage extends StObject {
  
  var parameters: PathAlertnumberQueryPagePerpage
  
  var responses: `200Content182`
}
object ParametersPathAlertnumberQueryPagePerpage {
  
  inline def apply(parameters: PathAlertnumberQueryPagePerpage, responses: `200Content182`): ParametersPathAlertnumberQueryPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumberQueryPagePerpage]
  }
  
  extension [Self <: ParametersPathAlertnumberQueryPagePerpage](x: Self) {
    
    inline def setParameters(value: PathAlertnumberQueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content182`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
