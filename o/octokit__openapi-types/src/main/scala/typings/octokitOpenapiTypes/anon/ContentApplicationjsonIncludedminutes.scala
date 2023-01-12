package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIncludedminutes extends StObject {
  
  var content: ApplicationjsonIncludedminutes
}
object ContentApplicationjsonIncludedminutes {
  
  inline def apply(content: ApplicationjsonIncludedminutes): ContentApplicationjsonIncludedminutes = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIncludedminutes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonIncludedminutes] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonIncludedminutes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
