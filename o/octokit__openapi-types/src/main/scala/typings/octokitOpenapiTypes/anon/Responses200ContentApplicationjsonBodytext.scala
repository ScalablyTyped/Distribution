package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodytext extends StObject {
  
  var parameters: PathCommentidOwnerRepo
  
  var responses: `200ContentApplicationjsonBodytext`
}
object Responses200ContentApplicationjsonBodytext {
  
  inline def apply(parameters: PathCommentidOwnerRepo, responses: `200ContentApplicationjsonBodytext`): Responses200ContentApplicationjsonBodytext = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodytext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBodytext] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodytext`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
