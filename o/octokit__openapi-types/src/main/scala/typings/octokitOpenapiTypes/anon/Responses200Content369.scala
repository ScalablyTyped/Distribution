package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content369 extends StObject {
  
  var parameters: PathCommentidOwner
  
  var responses: `200Content369`
}
object Responses200Content369 {
  
  inline def apply(parameters: PathCommentidOwner, responses: `200Content369`): Responses200Content369 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content369]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content369] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content369`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
