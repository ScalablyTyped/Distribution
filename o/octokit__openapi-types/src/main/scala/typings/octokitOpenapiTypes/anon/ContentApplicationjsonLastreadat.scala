package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLastreadat extends StObject {
  
  var content: ApplicationjsonLastreadat
}
object ContentApplicationjsonLastreadat {
  
  inline def apply(content: ApplicationjsonLastreadat): ContentApplicationjsonLastreadat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLastreadat]
  }
  
  extension [Self <: ContentApplicationjsonLastreadat](x: Self) {
    
    inline def setContent(value: ApplicationjsonLastreadat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
