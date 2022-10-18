package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath317RequestBodyContentApplicationjsonRunnersArray extends StObject {
  
  var parameters: Path317
  
  var requestBody: ContentApplicationjsonRunnersArray
}
object ParametersPath317RequestBodyContentApplicationjsonRunnersArray {
  
  inline def apply(parameters: Path317, requestBody: ContentApplicationjsonRunnersArray): ParametersPath317RequestBodyContentApplicationjsonRunnersArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath317RequestBodyContentApplicationjsonRunnersArray]
  }
  
  extension [Self <: ParametersPath317RequestBodyContentApplicationjsonRunnersArray](x: Self) {
    
    inline def setParameters(value: Path317): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRunnersArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
