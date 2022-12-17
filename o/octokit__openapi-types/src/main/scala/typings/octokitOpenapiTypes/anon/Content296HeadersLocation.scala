package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content296HeadersLocation extends StObject {
  
  var content: `296`
  
  var headers: Location
}
object Content296HeadersLocation {
  
  inline def apply(content: `296`, headers: Location): Content296HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content296HeadersLocation]
  }
  
  extension [Self <: Content296HeadersLocation](x: Self) {
    
    inline def setContent(value: `296`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
