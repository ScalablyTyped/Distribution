package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403404409422 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonBaseCommitmessage
  
  var responses: `403404409422`
}
object Responses403404409422 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonBaseCommitmessage, responses: `403404409422`): Responses403404409422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403404409422]
  }
  
  extension [Self <: Responses403404409422](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaseCommitmessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
