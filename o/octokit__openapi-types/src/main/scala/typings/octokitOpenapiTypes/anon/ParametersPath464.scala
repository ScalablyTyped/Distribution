package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath464 extends StObject {
  
  var parameters: Path464
  
  var responses: `200Content463`
}
object ParametersPath464 {
  
  inline def apply(parameters: Path464, responses: `200Content463`): ParametersPath464 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath464]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath464] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path464): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content463`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
