package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content290 extends StObject {
  
  var parameters: `135`
  
  var responses: `201Content290`
}
object Responses201Content290 {
  
  inline def apply(parameters: `135`, responses: `201Content290`): Responses201Content290 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content290]
  }
  
  extension [Self <: Responses201Content290](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content290`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
