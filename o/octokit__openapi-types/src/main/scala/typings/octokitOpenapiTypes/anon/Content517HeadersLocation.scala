package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content517HeadersLocation extends StObject {
  
  var content: `517`
  
  var headers: Location
}
object Content517HeadersLocation {
  
  inline def apply(content: `517`, headers: Location): Content517HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content517HeadersLocation]
  }
  
  extension [Self <: Content517HeadersLocation](x: Self) {
    
    inline def setContent(value: `517`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
