package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content451304Unknown extends StObject {
  
  var parameters: `416`
  
  var responses: `200Content451304Unknown`
}
object Responses200Content451304Unknown {
  
  inline def apply(parameters: `416`, responses: `200Content451304Unknown`): Responses200Content451304Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content451304Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content451304Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `416`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content451304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
