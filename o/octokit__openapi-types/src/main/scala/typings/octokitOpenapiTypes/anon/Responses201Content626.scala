package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content626 extends StObject {
  
  var requestBody: ContentApplicationjsonArmoredpublickey
  
  var responses: `201Content626`
}
object Responses201Content626 {
  
  inline def apply(requestBody: ContentApplicationjsonArmoredpublickey, responses: `201Content626`): Responses201Content626 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content626]
  }
  
  extension [Self <: Responses201Content626](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonArmoredpublickey): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content626`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
