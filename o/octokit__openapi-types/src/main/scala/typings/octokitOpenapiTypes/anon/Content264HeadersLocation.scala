package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content264HeadersLocation extends StObject {
  
  var content: `264`
  
  var headers: Location
}
object Content264HeadersLocation {
  
  inline def apply(content: `264`, headers: Location): Content264HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content264HeadersLocation]
  }
  
  extension [Self <: Content264HeadersLocation](x: Self) {
    
    inline def setContent(value: `264`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
