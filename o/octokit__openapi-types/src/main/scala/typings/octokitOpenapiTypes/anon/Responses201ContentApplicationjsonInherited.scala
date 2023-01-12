package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonInherited extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjsonRestrictedtoworkflows
  
  var responses: `201ContentApplicationjsonInherited`
}
object Responses201ContentApplicationjsonInherited {
  
  inline def apply(
    parameters: `433`,
    requestBody: ContentApplicationjsonRestrictedtoworkflows,
    responses: `201ContentApplicationjsonInherited`
  ): Responses201ContentApplicationjsonInherited = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonInherited]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonInherited] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRestrictedtoworkflows): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonInherited`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
