package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBlockcreations extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonBlockcreations`
}
object Responses200ContentApplicationjsonBlockcreations {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonBlockcreations`): Responses200ContentApplicationjsonBlockcreations = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBlockcreations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBlockcreations] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBlockcreations`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
