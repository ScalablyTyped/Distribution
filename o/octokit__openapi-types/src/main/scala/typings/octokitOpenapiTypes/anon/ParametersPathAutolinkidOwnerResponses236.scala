package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAutolinkidOwnerResponses236 extends StObject {
  
  var parameters: PathAutolinkidOwner
  
  var responses: `236`
}
object ParametersPathAutolinkidOwnerResponses236 {
  
  inline def apply(parameters: PathAutolinkidOwner, responses: `236`): ParametersPathAutolinkidOwnerResponses236 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAutolinkidOwnerResponses236]
  }
  
  extension [Self <: ParametersPathAutolinkidOwnerResponses236](x: Self) {
    
    inline def setParameters(value: PathAutolinkidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `236`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
