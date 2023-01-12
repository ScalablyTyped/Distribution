package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent143 extends StObject {
  
  var parameters: PathJobid
  
  var requestBody: Content143
  
  var responses: `201Content60403`
}
object RequestBodyContent143 {
  
  inline def apply(parameters: PathJobid, requestBody: Content143, responses: `201Content60403`): RequestBodyContent143 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent143]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent143] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathJobid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content143): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content60403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
