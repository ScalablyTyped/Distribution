package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringResponses612 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `612`
}
object ParametersPathOwnerStringResponses612 {
  
  inline def apply(parameters: PathOwnerString, responses: `612`): ParametersPathOwnerStringResponses612 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringResponses612]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringResponses612] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `612`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
