package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenameStringQuery extends StObject {
  
  var parameters: PathPackagenameStringQuery
  
  var responses: `401Content41403Content41`
}
object ParametersPathPackagenameStringQuery {
  
  inline def apply(parameters: PathPackagenameStringQuery, responses: `401Content41403Content41`): ParametersPathPackagenameStringQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenameStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenameStringQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenameStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content41403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
