package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content253 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200Content253`
}
object Responses200Content253 {
  
  inline def apply(parameters: PathOwner, responses: `200Content253`): Responses200Content253 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content253]
  }
  
  extension [Self <: Responses200Content253](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content253`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
