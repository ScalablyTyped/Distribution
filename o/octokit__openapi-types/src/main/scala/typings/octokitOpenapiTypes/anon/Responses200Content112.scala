package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content112 extends StObject {
  
  var parameters: `47`
  
  var responses: `200Content112`
}
object Responses200Content112 {
  
  inline def apply(parameters: `47`, responses: `200Content112`): Responses200Content112 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content112]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content112] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content112`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
