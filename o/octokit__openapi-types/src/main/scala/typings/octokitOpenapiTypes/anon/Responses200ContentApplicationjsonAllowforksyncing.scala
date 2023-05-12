package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAllowforksyncing extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonAllowforksyncing`
}
object Responses200ContentApplicationjsonAllowforksyncing {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonAllowforksyncing`): Responses200ContentApplicationjsonAllowforksyncing = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAllowforksyncing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonAllowforksyncing] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAllowforksyncing`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
