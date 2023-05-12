package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNodeidUpdatedat extends StObject {
  
  var content: ApplicationjsonNodeidUpdatedat
  
  var headers: Location
}
object ContentApplicationjsonNodeidUpdatedat {
  
  inline def apply(content: ApplicationjsonNodeidUpdatedat, headers: Location): ContentApplicationjsonNodeidUpdatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNodeidUpdatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonNodeidUpdatedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonNodeidUpdatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
