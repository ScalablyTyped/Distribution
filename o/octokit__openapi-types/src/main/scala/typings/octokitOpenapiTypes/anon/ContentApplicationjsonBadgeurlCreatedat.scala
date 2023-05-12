package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBadgeurlCreatedat extends StObject {
  
  var content: ApplicationjsonBadgeurlCreatedat
}
object ContentApplicationjsonBadgeurlCreatedat {
  
  inline def apply(content: ApplicationjsonBadgeurlCreatedat): ContentApplicationjsonBadgeurlCreatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBadgeurlCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBadgeurlCreatedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBadgeurlCreatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
