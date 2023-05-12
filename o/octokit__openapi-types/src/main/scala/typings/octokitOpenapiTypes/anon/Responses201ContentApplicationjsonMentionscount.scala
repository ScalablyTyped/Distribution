package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonMentionscount extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonDiscussioncategoryname
  
  var responses: `201ContentApplicationjsonMentionscount`
}
object Responses201ContentApplicationjsonMentionscount {
  
  inline def apply(
    parameters: `540`,
    requestBody: ContentApplicationjsonDiscussioncategoryname,
    responses: `201ContentApplicationjsonMentionscount`
  ): Responses201ContentApplicationjsonMentionscount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonMentionscount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonMentionscount] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDiscussioncategoryname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonMentionscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
