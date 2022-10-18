package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content560HeadersLocation extends StObject {
  
  var content: `560`
  
  var headers: Location
}
object Content560HeadersLocation {
  
  inline def apply(content: `560`, headers: Location): Content560HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content560HeadersLocation]
  }
  
  extension [Self <: Content560HeadersLocation](x: Self) {
    
    inline def setContent(value: `560`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
