package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSubscribed extends StObject {
  
  var content: ApplicationjsonSubscribed
}
object ContentApplicationjsonSubscribed {
  
  inline def apply(content: ApplicationjsonSubscribed): ContentApplicationjsonSubscribed = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSubscribed]
  }
  
  extension [Self <: ContentApplicationjsonSubscribed](x: Self) {
    
    inline def setContent(value: ApplicationjsonSubscribed): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
