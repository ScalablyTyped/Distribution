package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonClosedissues extends StObject {
  
  var content: ApplicationjsonClosedissues
  
  var headers: Location
}
object ContentApplicationjsonClosedissues {
  
  inline def apply(content: ApplicationjsonClosedissues, headers: Location): ContentApplicationjsonClosedissues = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonClosedissues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonClosedissues] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonClosedissues): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
