package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeResponses99 extends StObject {
  
  var parameters: PathPackagenamePackagetype
  
  var responses: `99`
}
object ParametersPathPackagenamePackagetypeResponses99 {
  
  inline def apply(parameters: PathPackagenamePackagetype, responses: `99`): ParametersPathPackagenamePackagetypeResponses99 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeResponses99]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenamePackagetypeResponses99] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenamePackagetype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `99`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
