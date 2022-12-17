package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses459 extends StObject {
  
  var parameters: PathTeamslugStringQuery407
  
  var responses: `459`
}
object Responses459 {
  
  inline def apply(parameters: PathTeamslugStringQuery407, responses: `459`): Responses459 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses459]
  }
  
  extension [Self <: Responses459](x: Self) {
    
    inline def setParameters(value: PathTeamslugStringQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `459`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
