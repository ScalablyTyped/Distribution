package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDownloadurlEncoding extends StObject {
  
  var content: ApplicationjsonDownloadurlEncoding
}
object ContentApplicationjsonDownloadurlEncoding {
  
  inline def apply(content: ApplicationjsonDownloadurlEncoding): ContentApplicationjsonDownloadurlEncoding = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDownloadurlEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDownloadurlEncoding] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDownloadurlEncoding): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
