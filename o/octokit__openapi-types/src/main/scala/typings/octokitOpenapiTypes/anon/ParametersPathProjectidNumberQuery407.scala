package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidNumberQuery407 extends StObject {
  
  var parameters: PathProjectidNumberQuery407
  
  var responses: `200Content471`
}
object ParametersPathProjectidNumberQuery407 {
  
  inline def apply(parameters: PathProjectidNumberQuery407, responses: `200Content471`): ParametersPathProjectidNumberQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidNumberQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProjectidNumberQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidNumberQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content471`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
