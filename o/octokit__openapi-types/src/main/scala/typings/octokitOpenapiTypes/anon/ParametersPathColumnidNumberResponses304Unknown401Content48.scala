package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathColumnidNumberResponses304Unknown401Content48 extends StObject {
  
  var parameters: PathColumnidNumber
  
  var responses: `304Unknown401Content48`
}
object ParametersPathColumnidNumberResponses304Unknown401Content48 {
  
  inline def apply(parameters: PathColumnidNumber, responses: `304Unknown401Content48`): ParametersPathColumnidNumberResponses304Unknown401Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathColumnidNumberResponses304Unknown401Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathColumnidNumberResponses304Unknown401Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
