package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content48404Unknown extends StObject {
  
  var parameters: PathTeamidNumberUsernameString
  
  var responses: `403Content48404Unknown`
}
object Responses403Content48404Unknown {
  
  inline def apply(parameters: PathTeamidNumberUsernameString, responses: `403Content48404Unknown`): Responses403Content48404Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content48404Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403Content48404Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content48404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
