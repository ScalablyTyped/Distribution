package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses500Content55 extends StObject {
  
  var parameters: `495`
  
  var responses: `500Content55`
}
object Responses500Content55 {
  
  inline def apply(parameters: `495`, responses: `500Content55`): Responses500Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses500Content55]
  }
  
  extension [Self <: Responses500Content55](x: Self) {
    
    inline def setParameters(value: `495`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `500Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
