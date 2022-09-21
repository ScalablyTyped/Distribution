package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerResponses133 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `133`
}
object ParametersPathOwnerResponses133 {
  
  inline def apply(parameters: PathOwner, responses: `133`): ParametersPathOwnerResponses133 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerResponses133]
  }
  
  extension [Self <: ParametersPathOwnerResponses133](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `133`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
