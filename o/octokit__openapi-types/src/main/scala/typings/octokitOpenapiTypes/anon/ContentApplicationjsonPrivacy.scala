package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPrivacy extends StObject {
  
  var content: ApplicationjsonPrivacy
}
object ContentApplicationjsonPrivacy {
  
  inline def apply(content: ApplicationjsonPrivacy): ContentApplicationjsonPrivacy = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPrivacy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonPrivacy] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonPrivacy): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
