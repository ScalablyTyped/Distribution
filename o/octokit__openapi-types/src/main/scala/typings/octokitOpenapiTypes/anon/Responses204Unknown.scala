package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses204Unknown extends StObject {
  
  var parameters: `472`
  
  var responses: `204Unknown`
}
object Responses204Unknown {
  
  inline def apply(parameters: `472`, responses: `204Unknown`): Responses204Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses204Unknown]
  }
  
  extension [Self <: Responses204Unknown](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `204Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
