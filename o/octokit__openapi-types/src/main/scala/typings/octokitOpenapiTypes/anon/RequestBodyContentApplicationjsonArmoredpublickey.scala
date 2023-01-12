package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonArmoredpublickey extends StObject {
  
  var requestBody: ContentApplicationjsonArmoredpublickey
  
  var responses: `201304401403404422`
}
object RequestBodyContentApplicationjsonArmoredpublickey {
  
  inline def apply(requestBody: ContentApplicationjsonArmoredpublickey, responses: `201304401403404422`): RequestBodyContentApplicationjsonArmoredpublickey = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonArmoredpublickey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonArmoredpublickey] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonArmoredpublickey): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304401403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
