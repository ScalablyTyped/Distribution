package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses301Content55 extends StObject {
  
  var parameters: `491`
  
  var responses: `301Content55`
}
object Responses301Content55 {
  
  inline def apply(parameters: `491`, responses: `301Content55`): Responses301Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses301Content55]
  }
  
  extension [Self <: Responses301Content55](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
