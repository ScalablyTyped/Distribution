package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathJobid extends StObject {
  
  var parameters: PathJobid
  
  var responses: `200ContentApplicationjsonCheckrunurl`
}
object ParametersPathJobid {
  
  inline def apply(parameters: PathJobid, responses: `200ContentApplicationjsonCheckrunurl`): ParametersPathJobid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathJobid]
  }
  
  extension [Self <: ParametersPathJobid](x: Self) {
    
    inline def setParameters(value: PathJobid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckrunurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
