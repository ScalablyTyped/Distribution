package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonArchivedownloadurl extends StObject {
  
  var content: ApplicationjsonArchivedownloadurl
}
object ContentApplicationjsonArchivedownloadurl {
  
  inline def apply(content: ApplicationjsonArchivedownloadurl): ContentApplicationjsonArchivedownloadurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonArchivedownloadurl]
  }
  
  extension [Self <: ContentApplicationjsonArchivedownloadurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonArchivedownloadurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
