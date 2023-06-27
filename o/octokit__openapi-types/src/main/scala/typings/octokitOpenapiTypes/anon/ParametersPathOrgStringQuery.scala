package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringQuery extends StObject {
  
  var parameters: PathOrgStringQuery
  
  var responses: `200ContentApplicationjsonRepositorycacheusagesTotalcount`
}
object ParametersPathOrgStringQuery {
  
  inline def apply(
    parameters: PathOrgStringQuery,
    responses: `200ContentApplicationjsonRepositorycacheusagesTotalcount`
  ): ParametersPathOrgStringQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgStringQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositorycacheusagesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
