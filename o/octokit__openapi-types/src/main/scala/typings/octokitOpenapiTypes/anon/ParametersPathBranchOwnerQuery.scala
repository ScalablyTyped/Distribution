package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerQuery extends StObject {
  
  var parameters: PathBranchOwnerQuery
  
  var responses: `200Content752`
}
object ParametersPathBranchOwnerQuery {
  
  inline def apply(parameters: PathBranchOwnerQuery, responses: `200Content752`): ParametersPathBranchOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content752`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
