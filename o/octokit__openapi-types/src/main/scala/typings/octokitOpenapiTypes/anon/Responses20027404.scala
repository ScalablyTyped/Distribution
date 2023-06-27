package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses20027404 extends StObject {
  
  var parameters: PathCommentid
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `20027404`
}
object Responses20027404 {
  
  inline def apply(parameters: PathCommentid, requestBody: ContentApplicationjsonBody, responses: `20027404`): Responses20027404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses20027404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses20027404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20027404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
