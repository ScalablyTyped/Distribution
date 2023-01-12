package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent267 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: Content267
  
  var responses: `200301404410`
}
object RequestBodyContent267 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: Content267, responses: `200301404410`): RequestBodyContent267 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent267]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent267] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content267): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
