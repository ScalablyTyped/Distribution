package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content578 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200Content578`
}
object Responses200Content578 {
  
  inline def apply(parameters: PathOwnerString, responses: `200Content578`): Responses200Content578 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content578]
  }
  
  extension [Self <: Responses200Content578](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content578`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
