package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGpgkeyid extends StObject {
  
  var parameters: PathGpgkeyid
  
  var responses: `200Content361`
}
object ParametersPathGpgkeyid {
  
  inline def apply(parameters: PathGpgkeyid, responses: `200Content361`): ParametersPathGpgkeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGpgkeyid]
  }
  
  extension [Self <: ParametersPathGpgkeyid](x: Self) {
    
    inline def setParameters(value: PathGpgkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content361`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
