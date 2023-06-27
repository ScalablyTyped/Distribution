package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeResponses115 extends StObject {
  
  var parameters: PathPackagenamePackagetype
  
  var responses: `115`
}
object ParametersPathPackagenamePackagetypeResponses115 {
  
  inline def apply(parameters: PathPackagenamePackagetype, responses: `115`): ParametersPathPackagenamePackagetypeResponses115 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeResponses115]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenamePackagetypeResponses115] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenamePackagetype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
