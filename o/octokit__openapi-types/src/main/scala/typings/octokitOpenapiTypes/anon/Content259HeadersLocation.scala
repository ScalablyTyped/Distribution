package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content259HeadersLocation extends StObject {
  
  var content: `259`
  
  var headers: Location
}
object Content259HeadersLocation {
  
  inline def apply(content: `259`, headers: Location): Content259HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content259HeadersLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content259HeadersLocation] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `259`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
