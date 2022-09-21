package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200487403Content55 extends StObject {
  
  var parameters: PathTeamidNumber
  
  var responses: `200487403Content55`
}
object Responses200487403Content55 {
  
  inline def apply(parameters: PathTeamidNumber, responses: `200487403Content55`): Responses200487403Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200487403Content55]
  }
  
  extension [Self <: Responses200487403Content55](x: Self) {
    
    inline def setParameters(value: PathTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200487403Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
