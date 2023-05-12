package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonGittagsurl extends StObject {
  
  var content: ApplicationjsonGittagsurl
}
object ContentApplicationjsonGittagsurl {
  
  inline def apply(content: ApplicationjsonGittagsurl): ContentApplicationjsonGittagsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonGittagsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonGittagsurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonGittagsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
