package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonStatusesurl extends StObject {
  
  var content: ApplicationjsonStatusesurl
}
object ContentApplicationjsonStatusesurl {
  
  inline def apply(content: ApplicationjsonStatusesurl): ContentApplicationjsonStatusesurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonStatusesurl]
  }
  
  extension [Self <: ContentApplicationjsonStatusesurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonStatusesurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
