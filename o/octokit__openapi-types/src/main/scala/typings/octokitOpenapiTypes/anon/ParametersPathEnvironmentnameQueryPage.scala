package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameQueryPage extends StObject {
  
  var parameters: PathEnvironmentnameQueryPage
  
  var responses: `200ContentApplicationjsonBranchpolicies`
}
object ParametersPathEnvironmentnameQueryPage {
  
  inline def apply(parameters: PathEnvironmentnameQueryPage, responses: `200ContentApplicationjsonBranchpolicies`): ParametersPathEnvironmentnameQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBranchpolicies`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
