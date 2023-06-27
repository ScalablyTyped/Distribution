package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonClosedissues extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonDueon
  
  var responses: `201ContentApplicationjsonClosedissues`
}
object Responses201ContentApplicationjsonClosedissues {
  
  inline def apply(
    parameters: `639`,
    requestBody: ContentApplicationjsonDueon,
    responses: `201ContentApplicationjsonClosedissues`
  ): Responses201ContentApplicationjsonClosedissues = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonClosedissues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonClosedissues] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDueon): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonClosedissues`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
