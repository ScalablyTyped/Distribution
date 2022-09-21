package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content55404Unknown extends StObject {
  
  var parameters: PathTeamidNumberUsernameString
  
  var responses: `403Content55404Unknown`
}
object Responses403Content55404Unknown {
  
  inline def apply(parameters: PathTeamidNumberUsernameString, responses: `403Content55404Unknown`): Responses403Content55404Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content55404Unknown]
  }
  
  extension [Self <: Responses403Content55404Unknown](x: Self) {
    
    inline def setParameters(value: PathTeamidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content55404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
