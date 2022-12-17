package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAutolinkidResponses6 extends StObject {
  
  var parameters: PathAutolinkid
  
  var responses: `6`
}
object ParametersPathAutolinkidResponses6 {
  
  inline def apply(parameters: PathAutolinkid, responses: `6`): ParametersPathAutolinkidResponses6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAutolinkidResponses6]
  }
  
  extension [Self <: ParametersPathAutolinkidResponses6](x: Self) {
    
    inline def setParameters(value: PathAutolinkid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
