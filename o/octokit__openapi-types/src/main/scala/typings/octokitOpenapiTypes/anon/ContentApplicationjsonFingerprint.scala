package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonFingerprint extends StObject {
  
  var content: ApplicationjsonFingerprint
}
object ContentApplicationjsonFingerprint {
  
  inline def apply(content: ApplicationjsonFingerprint): ContentApplicationjsonFingerprint = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonFingerprint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonFingerprint] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonFingerprint): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
