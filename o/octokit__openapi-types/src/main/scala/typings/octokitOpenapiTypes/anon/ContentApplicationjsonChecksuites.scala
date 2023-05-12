package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonChecksuites extends StObject {
  
  var content: ApplicationjsonChecksuites
  
  var headers: Link
}
object ContentApplicationjsonChecksuites {
  
  inline def apply(content: ApplicationjsonChecksuites, headers: Link): ContentApplicationjsonChecksuites = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonChecksuites]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonChecksuites] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonChecksuites): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
