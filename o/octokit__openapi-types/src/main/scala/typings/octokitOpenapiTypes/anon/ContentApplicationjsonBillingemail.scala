package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBillingemail extends StObject {
  
  var content: ApplicationjsonBillingemail
}
object ContentApplicationjsonBillingemail {
  
  inline def apply(content: ApplicationjsonBillingemail): ContentApplicationjsonBillingemail = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBillingemail]
  }
  
  extension [Self <: ContentApplicationjsonBillingemail](x: Self) {
    
    inline def setContent(value: ApplicationjsonBillingemail): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
