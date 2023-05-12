package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNameUpdatedat extends StObject {
  
  var content: ApplicationjsonNameUpdatedat
}
object ContentApplicationjsonNameUpdatedat {
  
  inline def apply(content: ApplicationjsonNameUpdatedat): ContentApplicationjsonNameUpdatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNameUpdatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonNameUpdatedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonNameUpdatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
