package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content219 extends StObject {
  
  var parameters: PathOwnerRefQueryPage
  
  var responses: `200Content219`
}
object Responses200Content219 {
  
  inline def apply(parameters: PathOwnerRefQueryPage, responses: `200Content219`): Responses200Content219 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content219]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content219] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRefQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content219`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
