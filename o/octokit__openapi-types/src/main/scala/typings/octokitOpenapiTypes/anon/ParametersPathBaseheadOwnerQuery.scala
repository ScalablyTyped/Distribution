package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBaseheadOwnerQuery extends StObject {
  
  var parameters: PathBaseheadOwnerQuery
  
  var responses: `200Content691`
}
object ParametersPathBaseheadOwnerQuery {
  
  inline def apply(parameters: PathBaseheadOwnerQuery, responses: `200Content691`): ParametersPathBaseheadOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBaseheadOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBaseheadOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBaseheadOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content691`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
