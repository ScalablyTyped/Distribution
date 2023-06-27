package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAutolinkidResponses9 extends StObject {
  
  var parameters: PathAutolinkid
  
  var responses: `9`
}
object ParametersPathAutolinkidResponses9 {
  
  inline def apply(parameters: PathAutolinkid, responses: `9`): ParametersPathAutolinkidResponses9 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAutolinkidResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAutolinkidResponses9] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAutolinkid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `9`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
