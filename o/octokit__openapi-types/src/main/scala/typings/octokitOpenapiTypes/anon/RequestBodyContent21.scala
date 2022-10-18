package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent21 extends StObject {
  
  var parameters: PathGistid
  
  var requestBody: Content21
  
  var responses: `200404422`
}
object RequestBodyContent21 {
  
  inline def apply(parameters: PathGistid, requestBody: Content21, responses: `200404422`): RequestBodyContent21 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent21]
  }
  
  extension [Self <: RequestBodyContent21](x: Self) {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content21): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
