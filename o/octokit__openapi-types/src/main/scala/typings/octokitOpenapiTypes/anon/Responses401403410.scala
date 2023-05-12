package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403410 extends StObject {
  
  var parameters: PathProjectidNumber
  
  var requestBody: js.UndefOr[ContentApplicationjsonOrganizationpermission] = js.undefined
  
  var responses: `401403410`
}
object Responses401403410 {
  
  inline def apply(parameters: PathProjectidNumber, responses: `401403410`): Responses401403410 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403410]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses401403410] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonOrganizationpermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `401403410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
