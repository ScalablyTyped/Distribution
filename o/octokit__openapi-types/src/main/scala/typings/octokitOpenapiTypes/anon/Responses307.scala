package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses307 extends StObject {
  
  var parameters: `135`
  
  var responses: `307`
}
object Responses307 {
  
  inline def apply(parameters: `135`, responses: `307`): Responses307 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses307]
  }
  
  extension [Self <: Responses307](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `307`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
