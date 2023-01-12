package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenameStringQuery455 extends StObject {
  
  var parameters: PathPackagenameStringQuery455
  
  var responses: `200Content456`
}
object ParametersPathPackagenameStringQuery455 {
  
  inline def apply(parameters: PathPackagenameStringQuery455, responses: `200Content456`): ParametersPathPackagenameStringQuery455 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenameStringQuery455]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenameStringQuery455] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenameStringQuery455): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content456`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
