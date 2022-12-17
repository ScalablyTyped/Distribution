package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentTexthtmlHeaders304Unknown extends StObject {
  
  var requestBody: ContentTextplain
  
  var responses: `200ContentTexthtmlHeaders304Unknown`
}
object Responses200ContentTexthtmlHeaders304Unknown {
  
  inline def apply(requestBody: ContentTextplain, responses: `200ContentTexthtmlHeaders304Unknown`): Responses200ContentTexthtmlHeaders304Unknown = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentTexthtmlHeaders304Unknown]
  }
  
  extension [Self <: Responses200ContentTexthtmlHeaders304Unknown](x: Self) {
    
    inline def setRequestBody(value: ContentTextplain): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentTexthtmlHeaders304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
