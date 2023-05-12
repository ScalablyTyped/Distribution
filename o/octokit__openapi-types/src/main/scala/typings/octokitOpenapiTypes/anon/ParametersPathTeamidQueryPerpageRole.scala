package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidQueryPerpageRole extends StObject {
  
  var parameters: PathTeamidQueryPerpageRole
  
  var responses: `200HeadersLink404`
}
object ParametersPathTeamidQueryPerpageRole {
  
  inline def apply(parameters: PathTeamidQueryPerpageRole, responses: `200HeadersLink404`): ParametersPathTeamidQueryPerpageRole = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidQueryPerpageRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidQueryPerpageRole] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidQueryPerpageRole): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200HeadersLink404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
