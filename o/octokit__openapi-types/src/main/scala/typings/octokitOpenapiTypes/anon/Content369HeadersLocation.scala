package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content369HeadersLocation extends StObject {
  
  var content: `369`
  
  var headers: Location
}
object Content369HeadersLocation {
  
  inline def apply(content: `369`, headers: Location): Content369HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content369HeadersLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content369HeadersLocation] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `369`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
