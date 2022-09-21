package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAutolinkidOwnerResponses404Content55 extends StObject {
  
  var parameters: PathAutolinkidOwner
  
  var responses: `404Content55`
}
object ParametersPathAutolinkidOwnerResponses404Content55 {
  
  inline def apply(parameters: PathAutolinkidOwner, responses: `404Content55`): ParametersPathAutolinkidOwnerResponses404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAutolinkidOwnerResponses404Content55]
  }
  
  extension [Self <: ParametersPathAutolinkidOwnerResponses404Content55](x: Self) {
    
    inline def setParameters(value: PathAutolinkidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
