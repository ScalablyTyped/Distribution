package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object ParametersPathOrgSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: PathOrgSecretname, requestBody: ContentApplicationjsonSelectedrepositoryids): ParametersPathOrgSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: ParametersPathOrgSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
