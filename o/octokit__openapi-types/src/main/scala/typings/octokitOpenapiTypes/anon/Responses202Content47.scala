package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202Content47 extends StObject {
  
  var parameters: `495`
  
  var responses: `202Content47`
}
object Responses202Content47 {
  
  inline def apply(parameters: `495`, responses: `202Content47`): Responses202Content47 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202Content47]
  }
  
  extension [Self <: Responses202Content47](x: Self) {
    
    inline def setParameters(value: `495`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202Content47`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
