package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonBodyCreatedat extends StObject {
  
  var parameters: PathGistidString
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `201ContentApplicationjsonBodyCreatedat`
}
object Responses201ContentApplicationjsonBodyCreatedat {
  
  inline def apply(
    parameters: PathGistidString,
    requestBody: ContentApplicationjsonBody,
    responses: `201ContentApplicationjsonBodyCreatedat`
  ): Responses201ContentApplicationjsonBodyCreatedat = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonBodyCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonBodyCreatedat] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonBodyCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
