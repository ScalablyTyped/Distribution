package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath608Query374 extends StObject {
  
  var parameters: Path608Query374
  
  var responses: `200Content375`
}
object ParametersPath608Query374 {
  
  inline def apply(parameters: Path608Query374, responses: `200Content375`): ParametersPath608Query374 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath608Query374]
  }
  
  extension [Self <: ParametersPath608Query374](x: Self) {
    
    inline def setParameters(value: Path608Query374): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content375`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
