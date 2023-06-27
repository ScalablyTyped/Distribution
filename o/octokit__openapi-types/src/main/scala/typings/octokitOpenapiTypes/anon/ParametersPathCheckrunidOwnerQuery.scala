package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCheckrunidOwnerQuery extends StObject {
  
  var parameters: PathCheckrunidOwnerQuery
  
  var responses: `200Content663`
}
object ParametersPathCheckrunidOwnerQuery {
  
  inline def apply(parameters: PathCheckrunidOwnerQuery, responses: `200Content663`): ParametersPathCheckrunidOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCheckrunidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCheckrunidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCheckrunidOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content663`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
