package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses577 extends StObject {
  
  var parameters: PathThreadidNumber
  
  var responses: `577`
}
object Responses577 {
  
  inline def apply(parameters: PathThreadidNumber, responses: `577`): Responses577 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses577]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses577] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathThreadidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `577`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
