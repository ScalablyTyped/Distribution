package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidQuery extends StObject {
  
  var parameters: PathChecksuiteidQuery
  
  var responses: `200ContentApplicationjsonCheckruns`
}
object ParametersPathChecksuiteidQuery {
  
  inline def apply(parameters: PathChecksuiteidQuery, responses: `200ContentApplicationjsonCheckruns`): ParametersPathChecksuiteidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathChecksuiteidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathChecksuiteidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
