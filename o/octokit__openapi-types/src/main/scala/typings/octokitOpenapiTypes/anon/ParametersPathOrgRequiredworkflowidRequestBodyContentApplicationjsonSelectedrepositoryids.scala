package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: PathOrgRequiredworkflowid
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object ParametersPathOrgRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: PathOrgRequiredworkflowid, requestBody: ContentApplicationjsonSelectedrepositoryids): ParametersPathOrgRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
