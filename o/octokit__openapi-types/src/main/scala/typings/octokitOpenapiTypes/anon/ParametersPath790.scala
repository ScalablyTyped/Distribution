package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath790 extends StObject {
  
  var parameters: Path790
  
  var responses: `200ContentApplicationjsonSelectedrepositoriesurlUpdatedat`
}
object ParametersPath790 {
  
  inline def apply(parameters: Path790, responses: `200ContentApplicationjsonSelectedrepositoriesurlUpdatedat`): ParametersPath790 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath790]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath790] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path790): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSelectedrepositoriesurlUpdatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
