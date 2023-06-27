package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200404503 extends StObject {
  
  var parameters: `165`
  
  var responses: `200404503`
}
object Responses200404503 {
  
  inline def apply(parameters: `165`, responses: `200404503`): Responses200404503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200404503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200404503] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
