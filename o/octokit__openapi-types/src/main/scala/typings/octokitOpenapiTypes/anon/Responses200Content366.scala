package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content366 extends StObject {
  
  var parameters: `303`
  
  var responses: `200Content366`
}
object Responses200Content366 {
  
  inline def apply(parameters: `303`, responses: `200Content366`): Responses200Content366 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content366]
  }
  
  extension [Self <: Responses200Content366](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content366`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
