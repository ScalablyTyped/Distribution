package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBuildtype extends StObject {
  
  var content: ApplicationjsonBuildtype
}
object ContentApplicationjsonBuildtype {
  
  inline def apply(content: ApplicationjsonBuildtype): ContentApplicationjsonBuildtype = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBuildtype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBuildtype] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBuildtype): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
