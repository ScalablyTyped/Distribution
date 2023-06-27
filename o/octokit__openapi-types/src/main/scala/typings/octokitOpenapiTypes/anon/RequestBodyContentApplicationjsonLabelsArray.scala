package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonLabelsArray extends StObject {
  
  var parameters: PathRunnerid
  
  var requestBody: ContentApplicationjsonLabelsArray
  
  var responses: `200404422`
}
object RequestBodyContentApplicationjsonLabelsArray {
  
  inline def apply(parameters: PathRunnerid, requestBody: ContentApplicationjsonLabelsArray, responses: `200404422`): RequestBodyContentApplicationjsonLabelsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonLabelsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonLabelsArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabelsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
