package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202403404422 extends StObject {
  
  var parameters: `496`
  
  var requestBody: ContentApplicationjsonPatids
  
  var responses: `202403404422`
}
object Responses202403404422 {
  
  inline def apply(parameters: `496`, requestBody: ContentApplicationjsonPatids, responses: `202403404422`): Responses202403404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202403404422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202403404422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPatids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
