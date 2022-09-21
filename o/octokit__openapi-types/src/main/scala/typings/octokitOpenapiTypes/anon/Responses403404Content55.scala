package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403404Content55 extends StObject {
  
  var parameters: `144`
  
  var responses: `403404Content55`
}
object Responses403404Content55 {
  
  inline def apply(parameters: `144`, responses: `403404Content55`): Responses403404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403404Content55]
  }
  
  extension [Self <: Responses403404Content55](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
