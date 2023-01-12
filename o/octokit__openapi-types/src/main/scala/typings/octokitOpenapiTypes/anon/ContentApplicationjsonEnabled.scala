package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEnabled extends StObject {
  
  var content: ApplicationjsonEnabled
}
object ContentApplicationjsonEnabled {
  
  inline def apply(content: ApplicationjsonEnabled): ContentApplicationjsonEnabled = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonEnabled] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonEnabled): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
