package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content583304 extends StObject {
  
  var parameters: `553`
  
  var responses: `200Content583304`
}
object Responses200Content583304 {
  
  inline def apply(parameters: `553`, responses: `200Content583304`): Responses200Content583304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content583304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content583304] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `553`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content583304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
