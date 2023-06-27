package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoQuery extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery
  
  var responses: `200Content714404Content41`
}
object ParametersPathIssuenumberOwnerRepoQuery {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery, responses: `200Content714404Content41`): ParametersPathIssuenumberOwnerRepoQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberOwnerRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content714404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
