package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerResponses102 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `102`
}
object ParametersPathOwnerResponses102 {
  
  inline def apply(parameters: PathOwner, responses: `102`): ParametersPathOwnerResponses102 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerResponses102]
  }
  
  extension [Self <: ParametersPathOwnerResponses102](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `102`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
