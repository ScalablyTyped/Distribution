package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content309 extends StObject {
  
  var parameters: PathPullnumberQueryPage
  
  var responses: `200Content309`
}
object Responses200Content309 {
  
  inline def apply(parameters: PathPullnumberQueryPage, responses: `200Content309`): Responses200Content309 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content309]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content309] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content309`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
