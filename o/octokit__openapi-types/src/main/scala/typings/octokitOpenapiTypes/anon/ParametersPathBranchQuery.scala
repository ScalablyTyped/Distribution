package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchQuery extends StObject {
  
  var parameters: PathBranchQuery
  
  var responses: `200Content392`
}
object ParametersPathBranchQuery {
  
  inline def apply(parameters: PathBranchQuery, responses: `200Content392`): ParametersPathBranchQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content392`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
