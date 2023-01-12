package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonParents extends StObject {
  
  var content: ApplicationjsonParents
}
object ContentApplicationjsonParents {
  
  inline def apply(content: ApplicationjsonParents): ContentApplicationjsonParents = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonParents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonParents] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonParents): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
