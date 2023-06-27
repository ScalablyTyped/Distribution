package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseStringQuery extends StObject {
  
  var parameters: PathEnterpriseStringQuery
  
  var responses: `200Content560`
}
object ParametersPathEnterpriseStringQuery {
  
  inline def apply(parameters: PathEnterpriseStringQuery, responses: `200Content560`): ParametersPathEnterpriseStringQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnterpriseStringQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content560`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
