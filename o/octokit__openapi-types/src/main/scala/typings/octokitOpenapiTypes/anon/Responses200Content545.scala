package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content545 extends StObject {
  
  var parameters: `544`
  
  var responses: `200Content545`
}
object Responses200Content545 {
  
  inline def apply(parameters: `544`, responses: `200Content545`): Responses200Content545 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content545]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content545] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `544`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content545`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
