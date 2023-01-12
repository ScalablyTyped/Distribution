package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAuthorscount extends StObject {
  
  var content: ApplicationjsonAuthorscount
}
object ContentApplicationjsonAuthorscount {
  
  inline def apply(content: ApplicationjsonAuthorscount): ContentApplicationjsonAuthorscount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAuthorscount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAuthorscount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAuthorscount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
