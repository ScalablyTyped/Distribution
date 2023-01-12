package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonEnvironments extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200ContentApplicationjsonEnvironments`
}
object Responses200ContentApplicationjsonEnvironments {
  
  inline def apply(parameters: PathOwner, responses: `200ContentApplicationjsonEnvironments`): Responses200ContentApplicationjsonEnvironments = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonEnvironments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonEnvironments] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonEnvironments`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
