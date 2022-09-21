package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistidStringQuery426 extends StObject {
  
  var parameters: PathGistidStringQuery426
  
  var responses: `200Content438`
}
object ParametersPathGistidStringQuery426 {
  
  inline def apply(parameters: PathGistidStringQuery426, responses: `200Content438`): ParametersPathGistidStringQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistidStringQuery426]
  }
  
  extension [Self <: ParametersPathGistidStringQuery426](x: Self) {
    
    inline def setParameters(value: PathGistidStringQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content438`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
