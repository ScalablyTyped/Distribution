package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200553 extends StObject {
  
  var parameters: `472`
  
  var responses: `200553`
}
object Responses200553 {
  
  inline def apply(parameters: `472`, responses: `200553`): Responses200553 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200553]
  }
  
  extension [Self <: Responses200553](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200553`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
