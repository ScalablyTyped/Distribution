package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInstancesurl extends StObject {
  
  var content: ApplicationjsonInstancesurl
}
object ContentApplicationjsonInstancesurl {
  
  inline def apply(content: ApplicationjsonInstancesurl): ContentApplicationjsonInstancesurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInstancesurl]
  }
  
  extension [Self <: ContentApplicationjsonInstancesurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonInstancesurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
