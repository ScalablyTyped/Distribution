package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200483 extends StObject {
  
  var parameters: PathTeamslugString
  
  var responses: `200483`
}
object Responses200483 {
  
  inline def apply(parameters: PathTeamslugString, responses: `200483`): Responses200483 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200483]
  }
  
  extension [Self <: Responses200483](x: Self) {
    
    inline def setParameters(value: PathTeamslugString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200483`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
