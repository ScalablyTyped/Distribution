package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBaseheadQuery extends StObject {
  
  var parameters: PathBaseheadQuery
  
  var responses: `200Content272`
}
object ParametersPathBaseheadQuery {
  
  inline def apply(parameters: PathBaseheadQuery, responses: `200Content272`): ParametersPathBaseheadQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBaseheadQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBaseheadQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBaseheadQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content272`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
