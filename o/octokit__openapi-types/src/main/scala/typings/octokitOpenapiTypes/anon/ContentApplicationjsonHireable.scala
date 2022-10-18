package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonHireable extends StObject {
  
  var content: ApplicationjsonHireable
}
object ContentApplicationjsonHireable {
  
  inline def apply(content: ApplicationjsonHireable): ContentApplicationjsonHireable = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonHireable]
  }
  
  extension [Self <: ContentApplicationjsonHireable](x: Self) {
    
    inline def setContent(value: ApplicationjsonHireable): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
