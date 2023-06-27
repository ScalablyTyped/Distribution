package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumberQuery extends StObject {
  
  var parameters: PathAttemptnumberQuery
  
  var responses: `200ContentApplicationjsonJobs`
}
object ParametersPathAttemptnumberQuery {
  
  inline def apply(parameters: PathAttemptnumberQuery, responses: `200ContentApplicationjsonJobs`): ParametersPathAttemptnumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAttemptnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAttemptnumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonJobs`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
