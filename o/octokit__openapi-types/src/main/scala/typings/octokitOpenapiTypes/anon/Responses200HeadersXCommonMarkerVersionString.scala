package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200HeadersXCommonMarkerVersionString extends StObject {
  
  var requestBody: js.UndefOr[ContentTextplain] = js.undefined
  
  var responses: `200HeadersXCommonMarkerVersionString`
}
object Responses200HeadersXCommonMarkerVersionString {
  
  inline def apply(responses: `200HeadersXCommonMarkerVersionString`): Responses200HeadersXCommonMarkerVersionString = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200HeadersXCommonMarkerVersionString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200HeadersXCommonMarkerVersionString] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentTextplain): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200HeadersXCommonMarkerVersionString`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
