package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonComment extends StObject {
  
  var content: ApplicationjsonComment
}
object ContentApplicationjsonComment {
  
  inline def apply(content: ApplicationjsonComment): ContentApplicationjsonComment = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonComment] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonComment): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
