package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content813 extends StObject {
  
  var parameters: Path786Query
  
  var responses: `200Content813`
}
object Responses200Content813 {
  
  inline def apply(parameters: Path786Query, responses: `200Content813`): Responses200Content813 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content813]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content813] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content813`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
