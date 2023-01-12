package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonOrganizationOrganizationurl extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `200ContentApplicationjsonOrganizationOrganizationurl`
}
object Responses200ContentApplicationjsonOrganizationOrganizationurl {
  
  inline def apply(parameters: PathUsernameString, responses: `200ContentApplicationjsonOrganizationOrganizationurl`): Responses200ContentApplicationjsonOrganizationOrganizationurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonOrganizationOrganizationurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonOrganizationOrganizationurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationOrganizationurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
