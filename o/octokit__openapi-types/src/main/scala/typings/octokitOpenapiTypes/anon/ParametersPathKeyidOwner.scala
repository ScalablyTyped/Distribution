package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidOwner extends StObject {
  
  var parameters: PathKeyidOwner
  
  var responses: `200273`
}
object ParametersPathKeyidOwner {
  
  inline def apply(parameters: PathKeyidOwner, responses: `200273`): ParametersPathKeyidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathKeyidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathKeyidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200273`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
