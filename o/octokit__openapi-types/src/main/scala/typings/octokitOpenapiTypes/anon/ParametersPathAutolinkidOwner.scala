package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAutolinkidOwner extends StObject {
  
  var parameters: PathAutolinkidOwner
  
  var responses: `200486`
}
object ParametersPathAutolinkidOwner {
  
  inline def apply(parameters: PathAutolinkidOwner, responses: `200486`): ParametersPathAutolinkidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAutolinkidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAutolinkidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAutolinkidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200486`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
