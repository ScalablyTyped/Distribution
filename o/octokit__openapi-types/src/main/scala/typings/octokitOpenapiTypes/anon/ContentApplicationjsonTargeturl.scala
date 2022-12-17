package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTargeturl extends StObject {
  
  var content: ApplicationjsonTargeturl
}
object ContentApplicationjsonTargeturl {
  
  inline def apply(content: ApplicationjsonTargeturl): ContentApplicationjsonTargeturl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTargeturl]
  }
  
  extension [Self <: ContentApplicationjsonTargeturl](x: Self) {
    
    inline def setContent(value: ApplicationjsonTargeturl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
