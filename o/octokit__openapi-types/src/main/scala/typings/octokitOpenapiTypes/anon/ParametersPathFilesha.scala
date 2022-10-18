package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathFilesha extends StObject {
  
  var parameters: PathFilesha
  
  var responses: `200ContentApplicationjsonHighlightedcontent`
}
object ParametersPathFilesha {
  
  inline def apply(parameters: PathFilesha, responses: `200ContentApplicationjsonHighlightedcontent`): ParametersPathFilesha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathFilesha]
  }
  
  extension [Self <: ParametersPathFilesha](x: Self) {
    
    inline def setParameters(value: PathFilesha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonHighlightedcontent`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
