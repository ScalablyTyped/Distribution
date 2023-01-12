package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202Content40403Unknown extends StObject {
  
  var parameters: `472`
  
  var responses: `202Content40403Unknown`
}
object Responses202Content40403Unknown {
  
  inline def apply(parameters: `472`, responses: `202Content40403Unknown`): Responses202Content40403Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202Content40403Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202Content40403Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202Content40403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
