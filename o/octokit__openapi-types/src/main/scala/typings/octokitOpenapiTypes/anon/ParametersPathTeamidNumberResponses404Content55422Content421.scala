package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberResponses404Content55422Content421 extends StObject {
  
  var parameters: PathTeamidNumber
  
  var responses: `404Content55422Content421`
}
object ParametersPathTeamidNumberResponses404Content55422Content421 {
  
  inline def apply(parameters: PathTeamidNumber, responses: `404Content55422Content421`): ParametersPathTeamidNumberResponses404Content55422Content421 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberResponses404Content55422Content421]
  }
  
  extension [Self <: ParametersPathTeamidNumberResponses404Content55422Content421](x: Self) {
    
    inline def setParameters(value: PathTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content55422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
