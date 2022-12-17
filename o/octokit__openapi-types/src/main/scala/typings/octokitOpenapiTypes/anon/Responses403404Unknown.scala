package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403404Unknown extends StObject {
  
  var parameters: PathTeamidUsername
  
  var responses: `403404Unknown`
}
object Responses403404Unknown {
  
  inline def apply(parameters: PathTeamidUsername, responses: `403404Unknown`): Responses403404Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403404Unknown]
  }
  
  extension [Self <: Responses403404Unknown](x: Self) {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
