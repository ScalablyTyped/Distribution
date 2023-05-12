package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649QueryPagePerpageSince extends StObject {
  
  var parameters: Path649QueryPagePerpageSince
  
  var responses: `200Content481422Content346`
}
object ParametersPath649QueryPagePerpageSince {
  
  inline def apply(parameters: Path649QueryPagePerpageSince, responses: `200Content481422Content346`): ParametersPath649QueryPagePerpageSince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649QueryPagePerpageSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649QueryPagePerpageSince] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649QueryPagePerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content481422Content346`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
