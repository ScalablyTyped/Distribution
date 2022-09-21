package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonInreplytoid extends StObject {
  
  var parameters: PathCommentidOwnerRepo
  
  var responses: `200ContentApplicationjsonInreplytoid`
}
object Responses200ContentApplicationjsonInreplytoid {
  
  inline def apply(parameters: PathCommentidOwnerRepo, responses: `200ContentApplicationjsonInreplytoid`): Responses200ContentApplicationjsonInreplytoid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonInreplytoid]
  }
  
  extension [Self <: Responses200ContentApplicationjsonInreplytoid](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonInreplytoid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
