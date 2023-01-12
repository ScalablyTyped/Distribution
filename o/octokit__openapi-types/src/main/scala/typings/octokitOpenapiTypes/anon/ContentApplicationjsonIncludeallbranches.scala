package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIncludeallbranches extends StObject {
  
  var content: ApplicationjsonIncludeallbranches
}
object ContentApplicationjsonIncludeallbranches {
  
  inline def apply(content: ApplicationjsonIncludeallbranches): ContentApplicationjsonIncludeallbranches = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIncludeallbranches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonIncludeallbranches] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonIncludeallbranches): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
