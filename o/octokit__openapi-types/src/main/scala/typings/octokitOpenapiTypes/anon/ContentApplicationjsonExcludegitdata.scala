package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonExcludegitdata extends StObject {
  
  var content: ApplicationjsonExcludegitdata
}
object ContentApplicationjsonExcludegitdata {
  
  inline def apply(content: ApplicationjsonExcludegitdata): ContentApplicationjsonExcludegitdata = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonExcludegitdata]
  }
  
  extension [Self <: ContentApplicationjsonExcludegitdata](x: Self) {
    
    inline def setContent(value: ApplicationjsonExcludegitdata): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
