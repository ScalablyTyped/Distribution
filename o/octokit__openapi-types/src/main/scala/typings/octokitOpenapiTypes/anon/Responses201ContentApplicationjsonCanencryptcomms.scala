package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonCanencryptcomms extends StObject {
  
  var requestBody: ContentApplicationjsonArmoredpublickey
  
  var responses: `201ContentApplicationjsonCanencryptcomms`
}
object Responses201ContentApplicationjsonCanencryptcomms {
  
  inline def apply(
    requestBody: ContentApplicationjsonArmoredpublickey,
    responses: `201ContentApplicationjsonCanencryptcomms`
  ): Responses201ContentApplicationjsonCanencryptcomms = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonCanencryptcomms]
  }
  
  extension [Self <: Responses201ContentApplicationjsonCanencryptcomms](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonArmoredpublickey): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCanencryptcomms`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
