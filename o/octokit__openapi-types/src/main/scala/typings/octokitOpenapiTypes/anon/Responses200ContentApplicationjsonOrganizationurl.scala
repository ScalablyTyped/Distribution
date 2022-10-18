package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonOrganizationurl extends StObject {
  
  var parameters: PathUsername
  
  var responses: `200ContentApplicationjsonOrganizationurl`
}
object Responses200ContentApplicationjsonOrganizationurl {
  
  inline def apply(parameters: PathUsername, responses: `200ContentApplicationjsonOrganizationurl`): Responses200ContentApplicationjsonOrganizationurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonOrganizationurl]
  }
  
  extension [Self <: Responses200ContentApplicationjsonOrganizationurl](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
