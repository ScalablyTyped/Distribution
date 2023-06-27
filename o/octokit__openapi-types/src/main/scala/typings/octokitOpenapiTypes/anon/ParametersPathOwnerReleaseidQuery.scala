package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidQuery extends StObject {
  
  var parameters: PathOwnerReleaseidQuery
  
  var responses: `200Content749`
}
object ParametersPathOwnerReleaseidQuery {
  
  inline def apply(parameters: PathOwnerReleaseidQuery, responses: `200Content749`): ParametersPathOwnerReleaseidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerReleaseidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerReleaseidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content749`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
