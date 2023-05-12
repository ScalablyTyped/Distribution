package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonExcludeownerprojects304 extends StObject {
  
  var requestBody: ContentApplicationjsonExcludegitdata
  
  var responses: `201ContentApplicationjsonExcludeownerprojects304`
}
object Responses201ContentApplicationjsonExcludeownerprojects304 {
  
  inline def apply(
    requestBody: ContentApplicationjsonExcludegitdata,
    responses: `201ContentApplicationjsonExcludeownerprojects304`
  ): Responses201ContentApplicationjsonExcludeownerprojects304 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonExcludeownerprojects304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonExcludeownerprojects304] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonExcludegitdata): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonExcludeownerprojects304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
