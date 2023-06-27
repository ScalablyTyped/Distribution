package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberOrgQuery extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberOrgQuery
  
  var responses: `200Content628`
}
object ParametersPathCommentnumberDiscussionnumberOrgQuery {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumberOrgQuery, responses: `200Content628`): ParametersPathCommentnumberDiscussionnumberOrgQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentnumberDiscussionnumberOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberOrgQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content628`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
