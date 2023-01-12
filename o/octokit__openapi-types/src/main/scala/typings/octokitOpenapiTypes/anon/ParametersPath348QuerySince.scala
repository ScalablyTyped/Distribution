package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath348QuerySince extends StObject {
  
  var parameters: Path348QuerySince
  
  var responses: `200Content30`
}
object ParametersPath348QuerySince {
  
  inline def apply(parameters: Path348QuerySince, responses: `200Content30`): ParametersPath348QuerySince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath348QuerySince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath348QuerySince] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path348QuerySince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content30`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
