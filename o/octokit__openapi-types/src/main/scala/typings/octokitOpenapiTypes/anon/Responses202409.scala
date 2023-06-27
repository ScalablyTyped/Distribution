package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202409 extends StObject {
  
  var parameters: `181`
  
  var responses: `202409`
}
object Responses202409 {
  
  inline def apply(parameters: `181`, responses: `202409`): Responses202409 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202409]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202409] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `181`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
