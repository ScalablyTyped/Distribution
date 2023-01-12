package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonReposcount extends StObject {
  
  var content: ApplicationjsonReposcount
}
object ContentApplicationjsonReposcount {
  
  inline def apply(content: ApplicationjsonReposcount): ContentApplicationjsonReposcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonReposcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonReposcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonReposcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
