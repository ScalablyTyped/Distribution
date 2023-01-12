package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContextCreatedat extends StObject {
  
  var content: ApplicationjsonContextCreatedat
  
  var headers: Location
}
object ContentApplicationjsonContextCreatedat {
  
  inline def apply(content: ApplicationjsonContextCreatedat, headers: Location): ContentApplicationjsonContextCreatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContextCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonContextCreatedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonContextCreatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
