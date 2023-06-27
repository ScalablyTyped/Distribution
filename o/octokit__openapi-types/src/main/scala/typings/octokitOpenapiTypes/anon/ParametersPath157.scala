package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath157 extends StObject {
  
  var parameters: Path157
  
  var responses: `200Content121`
}
object ParametersPath157 {
  
  inline def apply(parameters: Path157, responses: `200Content121`): ParametersPath157 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath157]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath157] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path157): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content121`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
