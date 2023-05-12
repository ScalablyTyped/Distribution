package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryArchivedstate extends StObject {
  
  var parameters: QueryArchivedstate
  
  var responses: `200Content133`
}
object ParametersQueryArchivedstate {
  
  inline def apply(parameters: QueryArchivedstate, responses: `200Content133`): ParametersQueryArchivedstate = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryArchivedstate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryArchivedstate] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryArchivedstate): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content133`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
