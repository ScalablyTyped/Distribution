package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content6404Unknown extends StObject {
  
  var parameters: PathTeamidUsername
  
  var responses: `403Content6404Unknown`
}
object Responses403Content6404Unknown {
  
  inline def apply(parameters: PathTeamidUsername, responses: `403Content6404Unknown`): Responses403Content6404Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content6404Unknown]
  }
  
  extension [Self <: Responses403Content6404Unknown](x: Self) {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content6404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
