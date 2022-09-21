package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content463403Content55404Content55 extends StObject {
  
  var parameters: PathTeamidNumberQuery426
  
  var responses: `200Content463403Content55404Content55`
}
object Responses200Content463403Content55404Content55 {
  
  inline def apply(parameters: PathTeamidNumberQuery426, responses: `200Content463403Content55404Content55`): Responses200Content463403Content55404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content463403Content55404Content55]
  }
  
  extension [Self <: Responses200Content463403Content55404Content55](x: Self) {
    
    inline def setParameters(value: PathTeamidNumberQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content463403Content55404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
