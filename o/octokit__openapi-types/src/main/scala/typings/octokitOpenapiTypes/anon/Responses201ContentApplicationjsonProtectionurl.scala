package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonProtectionurl extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonNewname
  
  var responses: `201ContentApplicationjsonProtectionurl`
}
object Responses201ContentApplicationjsonProtectionurl {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjsonNewname,
    responses: `201ContentApplicationjsonProtectionurl`
  ): Responses201ContentApplicationjsonProtectionurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonProtectionurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonProtectionurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonProtectionurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
