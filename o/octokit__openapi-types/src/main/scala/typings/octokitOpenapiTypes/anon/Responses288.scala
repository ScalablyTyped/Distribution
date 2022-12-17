package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses288 extends StObject {
  
  var parameters: `135`
  
  var responses: `288`
}
object Responses288 {
  
  inline def apply(parameters: `135`, responses: `288`): Responses288 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses288]
  }
  
  extension [Self <: Responses288](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `288`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
