package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonScope extends StObject {
  
  var content: ApplicationjsonScope
}
object ContentApplicationjsonScope {
  
  inline def apply(content: ApplicationjsonScope): ContentApplicationjsonScope = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonScope] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonScope): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
