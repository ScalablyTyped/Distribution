package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCardid extends StObject {
  
  var parameters: PathCardid
  
  var responses: `304401403404`
}
object ParametersPathCardid {
  
  inline def apply(parameters: PathCardid, responses: `304401403404`): ParametersPathCardid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCardid]
  }
  
  extension [Self <: ParametersPathCardid](x: Self) {
    
    inline def setParameters(value: PathCardid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
