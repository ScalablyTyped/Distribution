package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyName extends StObject {
  
  var content: ApplicationjsonBodyName
}
object ContentApplicationjsonBodyName {
  
  inline def apply(content: ApplicationjsonBodyName): ContentApplicationjsonBodyName = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBodyName] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodyName): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
