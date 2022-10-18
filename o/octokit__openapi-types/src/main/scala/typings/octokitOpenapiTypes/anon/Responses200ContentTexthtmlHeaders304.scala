package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentTexthtmlHeaders304 extends StObject {
  
  var requestBody: ContentTextplain
  
  var responses: `200ContentTexthtmlHeaders304`
}
object Responses200ContentTexthtmlHeaders304 {
  
  inline def apply(requestBody: ContentTextplain, responses: `200ContentTexthtmlHeaders304`): Responses200ContentTexthtmlHeaders304 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentTexthtmlHeaders304]
  }
  
  extension [Self <: Responses200ContentTexthtmlHeaders304](x: Self) {
    
    inline def setRequestBody(value: ContentTextplain): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentTexthtmlHeaders304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
