package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenameQuery extends StObject {
  
  var parameters: PathPackagenameQuery
  
  var responses: `115`
}
object ParametersPathPackagenameQuery {
  
  inline def apply(parameters: PathPackagenameQuery, responses: `115`): ParametersPathPackagenameQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenameQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenameQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
