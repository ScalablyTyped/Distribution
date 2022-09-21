package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringRequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: PathOrgString
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object ParametersPathOrgStringRequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: PathOrgString, requestBody: ContentApplicationjsonSelectedrepositoryids): ParametersPathOrgStringRequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringRequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: ParametersPathOrgStringRequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
