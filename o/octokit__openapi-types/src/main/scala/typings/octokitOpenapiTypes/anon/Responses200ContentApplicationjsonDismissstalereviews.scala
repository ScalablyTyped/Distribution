package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonDismissstalereviews extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonDismissstalereviews`
}
object Responses200ContentApplicationjsonDismissstalereviews {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonDismissstalereviews`): Responses200ContentApplicationjsonDismissstalereviews = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonDismissstalereviews]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonDismissstalereviews] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDismissstalereviews`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
