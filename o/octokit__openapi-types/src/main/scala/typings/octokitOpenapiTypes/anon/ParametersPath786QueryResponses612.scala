package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath786QueryResponses612 extends StObject {
  
  var parameters: Path786Query
  
  var responses: `612`
}
object ParametersPath786QueryResponses612 {
  
  inline def apply(parameters: Path786Query, responses: `612`): ParametersPath786QueryResponses612 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath786QueryResponses612]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath786QueryResponses612] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `612`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
