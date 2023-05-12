package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerResponses129 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `129`
}
object ParametersPathOwnerResponses129 {
  
  inline def apply(parameters: PathOwner, responses: `129`): ParametersPathOwnerResponses129 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerResponses129]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerResponses129] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `129`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
