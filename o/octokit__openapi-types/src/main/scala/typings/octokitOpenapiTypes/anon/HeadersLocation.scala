package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersLocation extends StObject {
  
  var content: ApplicationjsonLine
  
  var headers: Location
}
object HeadersLocation {
  
  inline def apply(content: ApplicationjsonLine, headers: Location): HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersLocation]
  }
  
  extension [Self <: HeadersLocation](x: Self) {
    
    inline def setContent(value: ApplicationjsonLine): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
