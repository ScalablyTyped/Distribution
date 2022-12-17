package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerResponses200Content28 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200Content28`
}
object ParametersPathOwnerResponses200Content28 {
  
  inline def apply(parameters: PathOwner, responses: `200Content28`): ParametersPathOwnerResponses200Content28 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerResponses200Content28]
  }
  
  extension [Self <: ParametersPathOwnerResponses200Content28](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content28`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
