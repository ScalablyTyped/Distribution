package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAuthorBranch extends StObject {
  
  var content: ApplicationjsonAuthorBranch
}
object ContentApplicationjsonAuthorBranch {
  
  inline def apply(content: ApplicationjsonAuthorBranch): ContentApplicationjsonAuthorBranch = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAuthorBranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAuthorBranch] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAuthorBranch): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
