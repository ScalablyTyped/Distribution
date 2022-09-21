package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content264 extends StObject {
  
  var parameters: PathCommentidOwner
  
  var responses: `200Content264`
}
object Responses200Content264 {
  
  inline def apply(parameters: PathCommentidOwner, responses: `200Content264`): Responses200Content264 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content264]
  }
  
  extension [Self <: Responses200Content264](x: Self) {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content264`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
