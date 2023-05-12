package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content398 extends StObject {
  
  var parameters: QueryPage
  
  var responses: `200Content398`
}
object Responses200Content398 {
  
  inline def apply(parameters: QueryPage, responses: `200Content398`): Responses200Content398 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content398]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content398] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content398`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
