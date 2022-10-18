package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunid extends StObject {
  
  var parameters: PathRunid
  
  var responses: `200ContentApplicationjsonCancelurl`
}
object ParametersPathRunid {
  
  inline def apply(parameters: PathRunid, responses: `200ContentApplicationjsonCancelurl`): ParametersPathRunid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunid]
  }
  
  extension [Self <: ParametersPathRunid](x: Self) {
    
    inline def setParameters(value: PathRunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCancelurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
