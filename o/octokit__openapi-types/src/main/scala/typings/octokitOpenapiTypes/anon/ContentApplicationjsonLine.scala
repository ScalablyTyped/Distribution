package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLine extends StObject {
  
  var content: ApplicationjsonLine
}
object ContentApplicationjsonLine {
  
  inline def apply(content: ApplicationjsonLine): ContentApplicationjsonLine = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonLine] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonLine): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
