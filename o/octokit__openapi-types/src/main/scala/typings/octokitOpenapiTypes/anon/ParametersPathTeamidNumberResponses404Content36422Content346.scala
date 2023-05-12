package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberResponses404Content36422Content346 extends StObject {
  
  var parameters: PathTeamidNumber
  
  var responses: `404Content36422Content346`
}
object ParametersPathTeamidNumberResponses404Content36422Content346 {
  
  inline def apply(parameters: PathTeamidNumber, responses: `404Content36422Content346`): ParametersPathTeamidNumberResponses404Content36422Content346 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberResponses404Content36422Content346]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberResponses404Content36422Content346] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content36422Content346`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
