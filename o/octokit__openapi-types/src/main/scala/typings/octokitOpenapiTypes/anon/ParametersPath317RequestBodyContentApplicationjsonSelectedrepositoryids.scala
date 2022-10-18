package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath317RequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: Path317
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object ParametersPath317RequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: Path317, requestBody: ContentApplicationjsonSelectedrepositoryids): ParametersPath317RequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath317RequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: ParametersPath317RequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: Path317): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
