package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath577QueryPagePerpageSince extends StObject {
  
  var parameters: Path577QueryPagePerpageSince
  
  var responses: `200Content418422Content397`
}
object ParametersPath577QueryPagePerpageSince {
  
  inline def apply(parameters: Path577QueryPagePerpageSince, responses: `200Content418422Content397`): ParametersPath577QueryPagePerpageSince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath577QueryPagePerpageSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath577QueryPagePerpageSince] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path577QueryPagePerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content418422Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
