package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content339 extends StObject {
  
  var parameters: `135`
  
  var responses: `200Content339`
}
object Responses200Content339 {
  
  inline def apply(parameters: `135`, responses: `200Content339`): Responses200Content339 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content339]
  }
  
  extension [Self <: Responses200Content339](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content339`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
