package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304404422500 extends StObject {
  
  var parameters: `496`
  
  var requestBody: ContentApplicationjsonSelectedusernames
  
  var responses: `304404422500`
}
object Responses304404422500 {
  
  inline def apply(parameters: `496`, requestBody: ContentApplicationjsonSelectedusernames, responses: `304404422500`): Responses304404422500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304404422500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304404422500] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedusernames): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304404422500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
