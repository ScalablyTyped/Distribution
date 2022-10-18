package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent74 extends StObject {
  
  var parameters: PathColumnidNumber
  
  var requestBody: Content74
  
  var responses: `201304401`
}
object RequestBodyContent74 {
  
  inline def apply(parameters: PathColumnidNumber, requestBody: Content74, responses: `201304401`): RequestBodyContent74 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent74]
  }
  
  extension [Self <: RequestBodyContent74](x: Self) {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content74): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
