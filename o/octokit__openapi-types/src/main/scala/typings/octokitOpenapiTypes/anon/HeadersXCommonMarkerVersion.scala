package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersXCommonMarkerVersion extends StObject {
  
  var content: Texthtml
  
  var headers: XCommonMarkerVersion_
}
object HeadersXCommonMarkerVersion {
  
  inline def apply(content: Texthtml, headers: XCommonMarkerVersion_): HeadersXCommonMarkerVersion = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersXCommonMarkerVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadersXCommonMarkerVersion] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Texthtml): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: XCommonMarkerVersion_): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
