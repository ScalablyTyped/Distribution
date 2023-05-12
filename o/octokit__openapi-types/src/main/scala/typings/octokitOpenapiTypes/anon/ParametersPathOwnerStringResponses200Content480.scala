package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringResponses200Content480 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200Content480`
}
object ParametersPathOwnerStringResponses200Content480 {
  
  inline def apply(parameters: PathOwnerString, responses: `200Content480`): ParametersPathOwnerStringResponses200Content480 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringResponses200Content480]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringResponses200Content480] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content480`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
