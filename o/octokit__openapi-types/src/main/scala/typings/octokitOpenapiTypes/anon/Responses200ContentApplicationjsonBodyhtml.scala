package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodyhtml extends StObject {
  
  var parameters: PathCommentidOwner
  
  var responses: `200ContentApplicationjsonBodyhtml`
}
object Responses200ContentApplicationjsonBodyhtml {
  
  inline def apply(parameters: PathCommentidOwner, responses: `200ContentApplicationjsonBodyhtml`): Responses200ContentApplicationjsonBodyhtml = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodyhtml]
  }
  
  extension [Self <: Responses200ContentApplicationjsonBodyhtml](x: Self) {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodyhtml`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
