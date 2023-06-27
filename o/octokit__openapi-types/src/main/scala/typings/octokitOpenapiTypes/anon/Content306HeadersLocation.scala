package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content306HeadersLocation extends StObject {
  
  var content: `306`
  
  var headers: Location
}
object Content306HeadersLocation {
  
  inline def apply(content: `306`, headers: Location): Content306HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content306HeadersLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content306HeadersLocation] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `306`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
