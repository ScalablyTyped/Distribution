package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIsalphanumeric extends StObject {
  
  var content: ApplicationjsonIsalphanumeric
}
object ContentApplicationjsonIsalphanumeric {
  
  inline def apply(content: ApplicationjsonIsalphanumeric): ContentApplicationjsonIsalphanumeric = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIsalphanumeric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonIsalphanumeric] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonIsalphanumeric): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
