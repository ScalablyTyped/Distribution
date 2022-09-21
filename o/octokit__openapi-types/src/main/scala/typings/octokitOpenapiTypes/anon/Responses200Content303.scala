package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content303 extends StObject {
  
  var parameters: PathCommentidOwner
  
  var responses: `200Content303`
}
object Responses200Content303 {
  
  inline def apply(parameters: PathCommentidOwner, responses: `200Content303`): Responses200Content303 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content303]
  }
  
  extension [Self <: Responses200Content303](x: Self) {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content303`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
