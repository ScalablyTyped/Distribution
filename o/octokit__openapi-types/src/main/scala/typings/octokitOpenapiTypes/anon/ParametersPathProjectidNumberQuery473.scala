package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidNumberQuery473 extends StObject {
  
  var parameters: PathProjectidNumberQuery473
  
  var responses: `200Content539`
}
object ParametersPathProjectidNumberQuery473 {
  
  inline def apply(parameters: PathProjectidNumberQuery473, responses: `200Content539`): ParametersPathProjectidNumberQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidNumberQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProjectidNumberQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidNumberQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content539`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
