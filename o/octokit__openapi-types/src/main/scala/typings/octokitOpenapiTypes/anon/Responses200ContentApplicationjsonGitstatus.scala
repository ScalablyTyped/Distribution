package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonGitstatus extends StObject {
  
  var parameters: PathCodespacenameString
  
  var requestBody: ContentApplicationjsonRecentfolders
  
  var responses: `200ContentApplicationjsonGitstatus`
}
object Responses200ContentApplicationjsonGitstatus {
  
  inline def apply(
    parameters: PathCodespacenameString,
    requestBody: ContentApplicationjsonRecentfolders,
    responses: `200ContentApplicationjsonGitstatus`
  ): Responses200ContentApplicationjsonGitstatus = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonGitstatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonGitstatus] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCodespacenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRecentfolders): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonGitstatus`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
