package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403410 extends StObject {
  
  var parameters: Path157
  
  var requestBody: js.UndefOr[ContentApplicationjsonOrganizationpermission] = js.undefined
  
  var responses: `403410`
}
object Responses403410 {
  
  inline def apply(parameters: Path157, responses: `403410`): Responses403410 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403410]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403410] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path157): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonOrganizationpermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `403410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
