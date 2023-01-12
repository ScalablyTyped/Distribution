package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content257HeadersLocation extends StObject {
  
  var content: `257`
  
  var headers: Location
}
object Content257HeadersLocation {
  
  inline def apply(content: `257`, headers: Location): Content257HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content257HeadersLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content257HeadersLocation] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `257`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
