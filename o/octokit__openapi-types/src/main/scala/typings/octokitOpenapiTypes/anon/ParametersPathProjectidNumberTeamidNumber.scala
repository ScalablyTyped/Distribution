package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidNumberTeamidNumber extends StObject {
  
  var parameters: PathProjectidNumberTeamidNumber
  
  var responses: `200ContentApplicationjsonColumnsurlCreatedat`
}
object ParametersPathProjectidNumberTeamidNumber {
  
  inline def apply(
    parameters: PathProjectidNumberTeamidNumber,
    responses: `200ContentApplicationjsonColumnsurlCreatedat`
  ): ParametersPathProjectidNumberTeamidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidNumberTeamidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProjectidNumberTeamidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidNumberTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonColumnsurlCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
