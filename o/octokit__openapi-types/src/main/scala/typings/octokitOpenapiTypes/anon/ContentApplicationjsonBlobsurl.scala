package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBlobsurl extends StObject {
  
  var content: ApplicationjsonBlobsurl
}
object ContentApplicationjsonBlobsurl {
  
  inline def apply(content: ApplicationjsonBlobsurl): ContentApplicationjsonBlobsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBlobsurl]
  }
  
  extension [Self <: ContentApplicationjsonBlobsurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonBlobsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
