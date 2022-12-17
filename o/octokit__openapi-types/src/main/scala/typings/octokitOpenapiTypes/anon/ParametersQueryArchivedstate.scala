package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryArchivedstate extends StObject {
  
  var parameters: QueryArchivedstate
  
  var responses: `200Content128`
}
object ParametersQueryArchivedstate {
  
  inline def apply(parameters: QueryArchivedstate, responses: `200Content128`): ParametersQueryArchivedstate = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryArchivedstate]
  }
  
  extension [Self <: ParametersQueryArchivedstate](x: Self) {
    
    inline def setParameters(value: QueryArchivedstate): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content128`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
