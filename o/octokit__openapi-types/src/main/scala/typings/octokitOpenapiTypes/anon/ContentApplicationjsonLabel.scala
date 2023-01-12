package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLabel extends StObject {
  
  var content: ApplicationjsonLabel
}
object ContentApplicationjsonLabel {
  
  inline def apply(content: ApplicationjsonLabel): ContentApplicationjsonLabel = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonLabel] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonLabel): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
