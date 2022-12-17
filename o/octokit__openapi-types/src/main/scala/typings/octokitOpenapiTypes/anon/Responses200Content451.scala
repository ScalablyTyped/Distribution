package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content451 extends StObject {
  
  var parameters: PathTeamidNumberQuery407
  
  var responses: `200Content451`
}
object Responses200Content451 {
  
  inline def apply(parameters: PathTeamidNumberQuery407, responses: `200Content451`): Responses200Content451 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content451]
  }
  
  extension [Self <: Responses200Content451](x: Self) {
    
    inline def setParameters(value: PathTeamidNumberQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content451`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
