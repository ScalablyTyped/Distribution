package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content243HeadersLocation extends StObject {
  
  var content: `243`
  
  var headers: Location
}
object Content243HeadersLocation {
  
  inline def apply(content: `243`, headers: Location): Content243HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content243HeadersLocation]
  }
  
  extension [Self <: Content243HeadersLocation](x: Self) {
    
    inline def setContent(value: `243`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
