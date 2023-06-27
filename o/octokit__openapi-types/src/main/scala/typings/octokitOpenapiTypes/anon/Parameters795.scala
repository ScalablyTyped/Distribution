package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters795 extends StObject {
  
  var parameters: `795`
  
  var responses: `200Content570304`
}
object Parameters795 {
  
  inline def apply(parameters: `795`, responses: `200Content570304`): Parameters795 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters795]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters795] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `795`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content570304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
