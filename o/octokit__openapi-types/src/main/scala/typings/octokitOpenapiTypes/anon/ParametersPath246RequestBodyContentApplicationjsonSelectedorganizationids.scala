package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath246RequestBodyContentApplicationjsonSelectedorganizationids extends StObject {
  
  var parameters: Path246
  
  var requestBody: ContentApplicationjsonSelectedorganizationids
}
object ParametersPath246RequestBodyContentApplicationjsonSelectedorganizationids {
  
  inline def apply(parameters: Path246, requestBody: ContentApplicationjsonSelectedorganizationids): ParametersPath246RequestBodyContentApplicationjsonSelectedorganizationids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath246RequestBodyContentApplicationjsonSelectedorganizationids]
  }
  
  extension [Self <: ParametersPath246RequestBodyContentApplicationjsonSelectedorganizationids](x: Self) {
    
    inline def setParameters(value: Path246): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedorganizationids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
