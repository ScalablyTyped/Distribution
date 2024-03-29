package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRef extends StObject {
  
  var parameters: PathOwnerRef
  
  var responses: `500503`
}
object ParametersPathOwnerRef {
  
  inline def apply(parameters: PathOwnerRef, responses: `500503`): ParametersPathOwnerRef = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRef] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRef): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `500503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
