package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLastusedat extends StObject {
  
  var content: ApplicationjsonLastusedat
}
object ContentApplicationjsonLastusedat {
  
  inline def apply(content: ApplicationjsonLastusedat): ContentApplicationjsonLastusedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLastusedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonLastusedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonLastusedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
