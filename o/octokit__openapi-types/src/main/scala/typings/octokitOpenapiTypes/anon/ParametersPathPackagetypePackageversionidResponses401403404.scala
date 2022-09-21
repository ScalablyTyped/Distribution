package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypePackageversionidResponses401403404 extends StObject {
  
  var parameters: PathPackagetypePackageversionid
  
  var responses: `401403404`
}
object ParametersPathPackagetypePackageversionidResponses401403404 {
  
  inline def apply(parameters: PathPackagetypePackageversionid, responses: `401403404`): ParametersPathPackagetypePackageversionidResponses401403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypePackageversionidResponses401403404]
  }
  
  extension [Self <: ParametersPathPackagetypePackageversionidResponses401403404](x: Self) {
    
    inline def setParameters(value: PathPackagetypePackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
