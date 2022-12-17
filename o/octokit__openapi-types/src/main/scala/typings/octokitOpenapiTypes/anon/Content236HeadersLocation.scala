package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content236HeadersLocation extends StObject {
  
  var content: `236`
  
  var headers: Location
}
object Content236HeadersLocation {
  
  inline def apply(content: `236`, headers: Location): Content236HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content236HeadersLocation]
  }
  
  extension [Self <: Content236HeadersLocation](x: Self) {
    
    inline def setContent(value: `236`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
