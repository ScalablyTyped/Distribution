package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRefQuery extends StObject {
  
  var parameters: PathOwnerRefQuery
  
  var responses: `200ContentApplicationjsonCheckruns`
}
object ParametersPathOwnerRefQuery {
  
  inline def apply(parameters: PathOwnerRefQuery, responses: `200ContentApplicationjsonCheckruns`): ParametersPathOwnerRefQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRefQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRefQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRefQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
