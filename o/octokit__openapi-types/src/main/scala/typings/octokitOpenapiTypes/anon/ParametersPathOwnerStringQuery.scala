package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery extends StObject {
  
  var parameters: PathOwnerStringQuery
  
  var responses: `200ContentApplicationjsonArtifactsTotalcount`
}
object ParametersPathOwnerStringQuery {
  
  inline def apply(parameters: PathOwnerStringQuery, responses: `200ContentApplicationjsonArtifactsTotalcount`): ParametersPathOwnerStringQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifactsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
