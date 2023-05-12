package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath652 extends StObject {
  
  var parameters: Path652
  
  var responses: `200ContentApplicationjsonSelectedrepositoriesurlUpdatedat`
}
object ParametersPath652 {
  
  inline def apply(parameters: Path652, responses: `200ContentApplicationjsonSelectedrepositoriesurlUpdatedat`): ParametersPath652 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath652]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath652] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path652): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSelectedrepositoriesurlUpdatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
