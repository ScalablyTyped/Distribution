package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDownloadcount extends StObject {
  
  var content: ApplicationjsonDownloadcount
}
object ContentApplicationjsonDownloadcount {
  
  inline def apply(content: ApplicationjsonDownloadcount): ContentApplicationjsonDownloadcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDownloadcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDownloadcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDownloadcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
