package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content588 extends StObject {
  
  var parameters: `582`
  
  var responses: `200Content588`
}
object Responses200Content588 {
  
  inline def apply(parameters: `582`, responses: `200Content588`): Responses200Content588 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content588]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content588] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content588`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
