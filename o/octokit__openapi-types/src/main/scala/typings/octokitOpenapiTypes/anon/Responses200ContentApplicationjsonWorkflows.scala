package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonWorkflows extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200ContentApplicationjsonWorkflows`
}
object Responses200ContentApplicationjsonWorkflows {
  
  inline def apply(parameters: PathOwner, responses: `200ContentApplicationjsonWorkflows`): Responses200ContentApplicationjsonWorkflows = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonWorkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonWorkflows] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonWorkflows`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
