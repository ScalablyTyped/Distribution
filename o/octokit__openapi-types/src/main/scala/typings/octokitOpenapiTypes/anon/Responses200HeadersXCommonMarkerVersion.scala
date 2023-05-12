package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200HeadersXCommonMarkerVersion extends StObject {
  
  var requestBody: js.UndefOr[ContentTextplain] = js.undefined
  
  var responses: `200HeadersXCommonMarkerVersion`
}
object Responses200HeadersXCommonMarkerVersion {
  
  inline def apply(responses: `200HeadersXCommonMarkerVersion`): Responses200HeadersXCommonMarkerVersion = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200HeadersXCommonMarkerVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200HeadersXCommonMarkerVersion] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentTextplain): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200HeadersXCommonMarkerVersion`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
