package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDeliveriesurl extends StObject {
  
  var content: ApplicationjsonDeliveriesurl
  
  var headers: Location
}
object ContentApplicationjsonDeliveriesurl {
  
  inline def apply(content: ApplicationjsonDeliveriesurl, headers: Location): ContentApplicationjsonDeliveriesurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDeliveriesurl]
  }
  
  extension [Self <: ContentApplicationjsonDeliveriesurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonDeliveriesurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
