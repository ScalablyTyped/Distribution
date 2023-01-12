package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonInherited extends StObject {
  
  var parameters: PathRunnergroupidNumber
  
  var requestBody: ContentApplicationjsonSelectedworkflows
  
  var responses: `200ContentApplicationjsonInherited`
}
object Responses200ContentApplicationjsonInherited {
  
  inline def apply(
    parameters: PathRunnergroupidNumber,
    requestBody: ContentApplicationjsonSelectedworkflows,
    responses: `200ContentApplicationjsonInherited`
  ): Responses200ContentApplicationjsonInherited = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonInherited]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonInherited] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnergroupidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedworkflows): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonInherited`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
