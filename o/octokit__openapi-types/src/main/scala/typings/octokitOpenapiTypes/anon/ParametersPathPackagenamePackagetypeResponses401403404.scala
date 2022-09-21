package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeResponses401403404 extends StObject {
  
  var parameters: PathPackagenamePackagetype
  
  var responses: `401403404`
}
object ParametersPathPackagenamePackagetypeResponses401403404 {
  
  inline def apply(parameters: PathPackagenamePackagetype, responses: `401403404`): ParametersPathPackagenamePackagetypeResponses401403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeResponses401403404]
  }
  
  extension [Self <: ParametersPathPackagenamePackagetypeResponses401403404](x: Self) {
    
    inline def setParameters(value: PathPackagenamePackagetype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
