package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content259 extends StObject {
  
  var parameters: `257`
  
  var responses: `200Content259`
}
object Responses200Content259 {
  
  inline def apply(parameters: `257`, responses: `200Content259`): Responses200Content259 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content259]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content259] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `257`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content259`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
