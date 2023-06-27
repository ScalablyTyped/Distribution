package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters262 extends StObject {
  
  var parameters: `262`
  
  var requestBody: ContentApplicationjsonCommitter
  
  var responses: `409422`
}
object Parameters262 {
  
  inline def apply(parameters: `262`, requestBody: ContentApplicationjsonCommitter, responses: `409422`): Parameters262 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters262]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters262] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `262`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCommitter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
