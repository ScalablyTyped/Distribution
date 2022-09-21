package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content252HeadersLocation extends StObject {
  
  var content: `252`
  
  var headers: Location
}
object Content252HeadersLocation {
  
  inline def apply(content: `252`, headers: Location): Content252HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content252HeadersLocation]
  }
  
  extension [Self <: Content252HeadersLocation](x: Self) {
    
    inline def setContent(value: `252`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
