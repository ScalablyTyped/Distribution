package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookid extends StObject {
  
  var parameters: PathHookid
  
  var responses: `20082`
}
object ParametersPathHookid {
  
  inline def apply(parameters: PathHookid, responses: `20082`): ParametersPathHookid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20082`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
