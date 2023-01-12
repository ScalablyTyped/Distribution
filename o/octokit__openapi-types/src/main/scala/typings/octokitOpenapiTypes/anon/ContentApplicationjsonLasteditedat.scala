package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLasteditedat extends StObject {
  
  var content: ApplicationjsonLasteditedat
}
object ContentApplicationjsonLasteditedat {
  
  inline def apply(content: ApplicationjsonLasteditedat): ContentApplicationjsonLasteditedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLasteditedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonLasteditedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonLasteditedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
