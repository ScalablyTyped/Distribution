package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRoleState404Content36 extends StObject {
  
  var parameters: PathTeamidNumberUsernameString
  
  var responses: `200ContentApplicationjsonRoleState404Content36`
}
object Responses200ContentApplicationjsonRoleState404Content36 {
  
  inline def apply(
    parameters: PathTeamidNumberUsernameString,
    responses: `200ContentApplicationjsonRoleState404Content36`
  ): Responses200ContentApplicationjsonRoleState404Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRoleState404Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRoleState404Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRoleState404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
