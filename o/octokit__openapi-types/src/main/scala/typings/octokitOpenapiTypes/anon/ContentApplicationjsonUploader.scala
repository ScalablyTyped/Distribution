package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonUploader extends StObject {
  
  var content: ApplicationjsonUploader
}
object ContentApplicationjsonUploader {
  
  inline def apply(content: ApplicationjsonUploader): ContentApplicationjsonUploader = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonUploader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonUploader] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonUploader): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
