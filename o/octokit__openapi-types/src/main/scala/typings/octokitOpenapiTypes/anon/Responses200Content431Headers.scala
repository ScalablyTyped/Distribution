package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content431Headers extends StObject {
  
  var parameters: `416`
  
  var responses: `200Content431Headers`
}
object Responses200Content431Headers {
  
  inline def apply(parameters: `416`, responses: `200Content431Headers`): Responses200Content431Headers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content431Headers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content431Headers] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `416`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content431Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
