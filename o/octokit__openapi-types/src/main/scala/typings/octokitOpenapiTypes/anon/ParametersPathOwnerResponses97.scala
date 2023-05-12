package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerResponses97 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `97`
}
object ParametersPathOwnerResponses97 {
  
  inline def apply(parameters: PathOwner, responses: `97`): ParametersPathOwnerResponses97 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerResponses97]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerResponses97] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `97`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
