package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonBaseroleCreatedat extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjsonBaserole
  
  var responses: `201ContentApplicationjsonBaseroleCreatedat`
}
object Responses201ContentApplicationjsonBaseroleCreatedat {
  
  inline def apply(
    parameters: `433`,
    requestBody: ContentApplicationjsonBaserole,
    responses: `201ContentApplicationjsonBaseroleCreatedat`
  ): Responses201ContentApplicationjsonBaseroleCreatedat = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonBaseroleCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonBaseroleCreatedat] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaserole): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonBaseroleCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
