package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNamePath extends StObject {
  
  var content: ApplicationjsonNamePath
}
object ContentApplicationjsonNamePath {
  
  inline def apply(content: ApplicationjsonNamePath): ContentApplicationjsonNamePath = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNamePath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonNamePath] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonNamePath): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
