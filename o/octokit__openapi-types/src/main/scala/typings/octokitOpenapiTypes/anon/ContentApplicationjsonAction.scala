package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAction extends StObject {
  
  var content: ApplicationjsonAction
}
object ContentApplicationjsonAction {
  
  inline def apply(content: ApplicationjsonAction): ContentApplicationjsonAction = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAction] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAction): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
