package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerQuery extends StObject {
  
  var parameters: PathOwnerQuery
  
  var responses: `200ContentApplicationjsonArtifacts`
}
object ParametersPathOwnerQuery {
  
  inline def apply(parameters: PathOwnerQuery, responses: `200ContentApplicationjsonArtifacts`): ParametersPathOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifacts`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
