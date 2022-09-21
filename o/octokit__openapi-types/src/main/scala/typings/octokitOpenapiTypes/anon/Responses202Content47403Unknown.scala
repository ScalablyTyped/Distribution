package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202Content47403Unknown extends StObject {
  
  var parameters: `491`
  
  var responses: `202Content47403Unknown`
}
object Responses202Content47403Unknown {
  
  inline def apply(parameters: `491`, responses: `202Content47403Unknown`): Responses202Content47403Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202Content47403Unknown]
  }
  
  extension [Self <: Responses202Content47403Unknown](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202Content47403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
