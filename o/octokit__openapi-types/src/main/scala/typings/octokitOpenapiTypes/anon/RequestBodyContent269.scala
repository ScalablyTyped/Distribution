package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent269 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: Content269
  
  var responses: `403404410422`
}
object RequestBodyContent269 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: Content269, responses: `403404410422`): RequestBodyContent269 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent269]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent269] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content269): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
