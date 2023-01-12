package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathFilesha extends StObject {
  
  var parameters: PathFilesha
  
  var responses: `200Content231`
}
object ParametersPathFilesha {
  
  inline def apply(parameters: PathFilesha, responses: `200Content231`): ParametersPathFilesha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathFilesha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathFilesha] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathFilesha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content231`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
