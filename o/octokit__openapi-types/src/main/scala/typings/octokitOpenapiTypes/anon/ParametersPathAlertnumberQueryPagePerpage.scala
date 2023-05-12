package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumberQueryPagePerpage extends StObject {
  
  var parameters: PathAlertnumberQueryPagePerpage
  
  var responses: `200Content340`
}
object ParametersPathAlertnumberQueryPagePerpage {
  
  inline def apply(parameters: PathAlertnumberQueryPagePerpage, responses: `200Content340`): ParametersPathAlertnumberQueryPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumberQueryPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAlertnumberQueryPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumberQueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content340`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
