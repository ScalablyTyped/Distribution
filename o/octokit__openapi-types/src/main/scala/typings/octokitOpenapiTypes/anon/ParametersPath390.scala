package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath390 extends StObject {
  
  var parameters: Path390
  
  var requestBody: Content68
  
  var responses: `391`
}
object ParametersPath390 {
  
  inline def apply(parameters: Path390, requestBody: Content68, responses: `391`): ParametersPath390 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath390]
  }
  
  extension [Self <: ParametersPath390](x: Self) {
    
    inline def setParameters(value: Path390): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content68): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `391`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
