package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content323 extends StObject {
  
  var parameters: PathCommentidOwner
  
  var responses: `200Content323`
}
object Responses200Content323 {
  
  inline def apply(parameters: PathCommentidOwner, responses: `200Content323`): Responses200Content323 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content323]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content323] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content323`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
