package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonExcludeownerprojects304Unknown extends StObject {
  
  var requestBody: ContentApplicationjsonExcludegitdata
  
  var responses: `201ContentApplicationjsonExcludeownerprojects304Unknown`
}
object Responses201ContentApplicationjsonExcludeownerprojects304Unknown {
  
  inline def apply(
    requestBody: ContentApplicationjsonExcludegitdata,
    responses: `201ContentApplicationjsonExcludeownerprojects304Unknown`
  ): Responses201ContentApplicationjsonExcludeownerprojects304Unknown = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonExcludeownerprojects304Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonExcludeownerprojects304Unknown] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonExcludegitdata): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonExcludeownerprojects304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
