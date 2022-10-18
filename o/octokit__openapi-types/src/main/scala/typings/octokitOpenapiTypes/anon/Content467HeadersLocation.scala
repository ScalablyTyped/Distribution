package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content467HeadersLocation extends StObject {
  
  var content: `467`
  
  var headers: Location
}
object Content467HeadersLocation {
  
  inline def apply(content: `467`, headers: Location): Content467HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content467HeadersLocation]
  }
  
  extension [Self <: Content467HeadersLocation](x: Self) {
    
    inline def setContent(value: `467`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
