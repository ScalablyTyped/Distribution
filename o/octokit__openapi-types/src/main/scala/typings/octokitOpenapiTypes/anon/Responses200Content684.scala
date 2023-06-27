package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content684 extends StObject {
  
  var parameters: `683`
  
  var responses: `200Content684`
}
object Responses200Content684 {
  
  inline def apply(parameters: `683`, responses: `200Content684`): Responses200Content684 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content684]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content684] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `683`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content684`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
