package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: PathSecretname
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object ParametersPathSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: PathSecretname, requestBody: ContentApplicationjsonSelectedrepositoryids): ParametersPathSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: ParametersPathSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
