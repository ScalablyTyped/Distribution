package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202Content308 extends StObject {
  
  var parameters: `418`
  
  var responses: `202Content308`
}
object Responses202Content308 {
  
  inline def apply(parameters: `418`, responses: `202Content308`): Responses202Content308 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202Content308]
  }
  
  extension [Self <: Responses202Content308](x: Self) {
    
    inline def setParameters(value: `418`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202Content308`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
