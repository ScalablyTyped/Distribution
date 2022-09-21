package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200487 extends StObject {
  
  var parameters: PathTeamslugString
  
  var responses: `200487`
}
object Responses200487 {
  
  inline def apply(parameters: PathTeamslugString, responses: `200487`): Responses200487 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200487]
  }
  
  extension [Self <: Responses200487](x: Self) {
    
    inline def setParameters(value: PathTeamslugString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200487`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
