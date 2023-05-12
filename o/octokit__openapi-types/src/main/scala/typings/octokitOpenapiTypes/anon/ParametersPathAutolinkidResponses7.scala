package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAutolinkidResponses7 extends StObject {
  
  var parameters: PathAutolinkid
  
  var responses: `7`
}
object ParametersPathAutolinkidResponses7 {
  
  inline def apply(parameters: PathAutolinkid, responses: `7`): ParametersPathAutolinkidResponses7 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAutolinkidResponses7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAutolinkidResponses7] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAutolinkid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `7`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
