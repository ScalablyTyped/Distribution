package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters475RequestBodyContent143 extends StObject {
  
  var parameters: `475`
  
  var requestBody: Content143
  
  var responses: `178`
}
object Parameters475RequestBodyContent143 {
  
  inline def apply(parameters: `475`, requestBody: Content143, responses: `178`): Parameters475RequestBodyContent143 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters475RequestBodyContent143]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters475RequestBodyContent143] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `475`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content143): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `178`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
