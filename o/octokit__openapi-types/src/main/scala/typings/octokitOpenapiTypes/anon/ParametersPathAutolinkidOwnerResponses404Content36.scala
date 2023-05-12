package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAutolinkidOwnerResponses404Content36 extends StObject {
  
  var parameters: PathAutolinkidOwner
  
  var responses: `404Content36`
}
object ParametersPathAutolinkidOwnerResponses404Content36 {
  
  inline def apply(parameters: PathAutolinkidOwner, responses: `404Content36`): ParametersPathAutolinkidOwnerResponses404Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAutolinkidOwnerResponses404Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAutolinkidOwnerResponses404Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAutolinkidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
