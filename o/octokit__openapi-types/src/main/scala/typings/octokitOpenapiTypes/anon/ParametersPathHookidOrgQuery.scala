package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrgQuery extends StObject {
  
  var parameters: PathHookidOrgQuery
  
  var responses: `400422`
}
object ParametersPathHookidOrgQuery {
  
  inline def apply(parameters: PathHookidOrgQuery, responses: `400422`): ParametersPathHookidOrgQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOrgQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
