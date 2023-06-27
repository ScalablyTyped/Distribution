package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgQuery extends StObject {
  
  var parameters: PathOrgQuery
  
  var responses: `200ContentApplicationjsonRepositorycacheusages`
}
object ParametersPathOrgQuery {
  
  inline def apply(parameters: PathOrgQuery, responses: `200ContentApplicationjsonRepositorycacheusages`): ParametersPathOrgQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositorycacheusages`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
