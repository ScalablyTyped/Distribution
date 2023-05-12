package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCheckrunidOwnerQuery473 extends StObject {
  
  var parameters: PathCheckrunidOwnerQuery473
  
  var responses: `200Content559`
}
object ParametersPathCheckrunidOwnerQuery473 {
  
  inline def apply(parameters: PathCheckrunidOwnerQuery473, responses: `200Content559`): ParametersPathCheckrunidOwnerQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCheckrunidOwnerQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCheckrunidOwnerQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCheckrunidOwnerQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content559`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
