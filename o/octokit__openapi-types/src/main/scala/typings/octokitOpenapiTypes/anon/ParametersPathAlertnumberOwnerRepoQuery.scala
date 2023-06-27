package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumberOwnerRepoQuery extends StObject {
  
  var parameters: PathAlertnumberOwnerRepoQuery
  
  var responses: `200Content667`
}
object ParametersPathAlertnumberOwnerRepoQuery {
  
  inline def apply(parameters: PathAlertnumberOwnerRepoQuery, responses: `200Content667`): ParametersPathAlertnumberOwnerRepoQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumberOwnerRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAlertnumberOwnerRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumberOwnerRepoQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content667`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
