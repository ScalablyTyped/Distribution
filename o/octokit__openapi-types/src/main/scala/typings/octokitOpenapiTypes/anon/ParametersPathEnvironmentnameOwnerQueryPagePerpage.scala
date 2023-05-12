package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwnerQueryPagePerpage extends StObject {
  
  var parameters: PathEnvironmentnameOwnerQueryPagePerpage
  
  var responses: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations`
}
object ParametersPathEnvironmentnameOwnerQueryPagePerpage {
  
  inline def apply(
    parameters: PathEnvironmentnameOwnerQueryPagePerpage,
    responses: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations`
  ): ParametersPathEnvironmentnameOwnerQueryPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwnerQueryPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameOwnerQueryPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameOwnerQueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
