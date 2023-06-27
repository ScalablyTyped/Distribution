package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerResponses113 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `113`
}
object ParametersPathOwnerResponses113 {
  
  inline def apply(parameters: PathOwner, responses: `113`): ParametersPathOwnerResponses113 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerResponses113]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerResponses113] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `113`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
