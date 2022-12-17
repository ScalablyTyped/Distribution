package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200400401 extends StObject {
  
  var parameters: PathOwnerStringQuery407
  
  var responses: `200400401`
}
object Responses200400401 {
  
  inline def apply(parameters: PathOwnerStringQuery407, responses: `200400401`): Responses200400401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200400401]
  }
  
  extension [Self <: Responses200400401](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
