package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent24 extends StObject {
  
  var parameters: PathGistid
  
  var requestBody: Content24
  
  var responses: `404422`
}
object RequestBodyContent24 {
  
  inline def apply(parameters: PathGistid, requestBody: Content24, responses: `404422`): RequestBodyContent24 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent24]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent24] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content24): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
