package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContentDownloadurl extends StObject {
  
  var content: ApplicationjsonContentDownloadurl
}
object ContentApplicationjsonContentDownloadurl {
  
  inline def apply(content: ApplicationjsonContentDownloadurl): ContentApplicationjsonContentDownloadurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContentDownloadurl]
  }
  
  extension [Self <: ContentApplicationjsonContentDownloadurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonContentDownloadurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
