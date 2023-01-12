package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonKeyTitle extends StObject {
  
  var content: ApplicationjsonKeyTitle
}
object ContentApplicationjsonKeyTitle {
  
  inline def apply(content: ApplicationjsonKeyTitle): ContentApplicationjsonKeyTitle = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonKeyTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonKeyTitle] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonKeyTitle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
