package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content250HeadersLocation extends StObject {
  
  var content: `250`
  
  var headers: Location
}
object Content250HeadersLocation {
  
  inline def apply(content: `250`, headers: Location): Content250HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content250HeadersLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content250HeadersLocation] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `250`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
