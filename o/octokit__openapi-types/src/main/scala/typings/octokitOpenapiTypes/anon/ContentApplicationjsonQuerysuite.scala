package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonQuerysuite extends StObject {
  
  var content: ApplicationjsonQuerysuite
}
object ContentApplicationjsonQuerysuite {
  
  inline def apply(content: ApplicationjsonQuerysuite): ContentApplicationjsonQuerysuite = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonQuerysuite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonQuerysuite] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonQuerysuite): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
