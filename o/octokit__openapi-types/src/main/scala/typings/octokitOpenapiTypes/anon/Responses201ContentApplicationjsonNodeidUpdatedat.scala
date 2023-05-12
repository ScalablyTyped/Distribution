package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonNodeidUpdatedat extends StObject {
  
  var parameters: PathGistidString
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `201ContentApplicationjsonNodeidUpdatedat`
}
object Responses201ContentApplicationjsonNodeidUpdatedat {
  
  inline def apply(
    parameters: PathGistidString,
    requestBody: ContentApplicationjsonBody,
    responses: `201ContentApplicationjsonNodeidUpdatedat`
  ): Responses201ContentApplicationjsonNodeidUpdatedat = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonNodeidUpdatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonNodeidUpdatedat] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonNodeidUpdatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
