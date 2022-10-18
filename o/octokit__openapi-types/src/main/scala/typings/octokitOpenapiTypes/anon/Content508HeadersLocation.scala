package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content508HeadersLocation extends StObject {
  
  var content: `508`
  
  var headers: Location
}
object Content508HeadersLocation {
  
  inline def apply(content: `508`, headers: Location): Content508HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content508HeadersLocation]
  }
  
  extension [Self <: Content508HeadersLocation](x: Self) {
    
    inline def setContent(value: `508`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
