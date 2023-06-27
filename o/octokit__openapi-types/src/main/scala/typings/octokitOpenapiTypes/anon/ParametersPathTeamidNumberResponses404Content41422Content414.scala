package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberResponses404Content41422Content414 extends StObject {
  
  var parameters: PathTeamidNumber
  
  var responses: `404Content41422Content414`
}
object ParametersPathTeamidNumberResponses404Content41422Content414 {
  
  inline def apply(parameters: PathTeamidNumber, responses: `404Content41422Content414`): ParametersPathTeamidNumberResponses404Content41422Content414 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberResponses404Content41422Content414]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberResponses404Content41422Content414] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content41422Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
