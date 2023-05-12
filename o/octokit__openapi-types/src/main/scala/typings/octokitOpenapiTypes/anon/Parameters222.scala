package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters222 extends StObject {
  
  var parameters: `222`
  
  var requestBody: ContentApplicationjsonCommitter
  
  var responses: `409422`
}
object Parameters222 {
  
  inline def apply(parameters: `222`, requestBody: ContentApplicationjsonCommitter, responses: `409422`): Parameters222 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters222]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters222] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `222`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCommitter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
