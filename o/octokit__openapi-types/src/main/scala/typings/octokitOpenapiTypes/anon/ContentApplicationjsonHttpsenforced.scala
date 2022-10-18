package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonHttpsenforced extends StObject {
  
  var content: ApplicationjsonHttpsenforced
}
object ContentApplicationjsonHttpsenforced {
  
  inline def apply(content: ApplicationjsonHttpsenforced): ContentApplicationjsonHttpsenforced = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonHttpsenforced]
  }
  
  extension [Self <: ContentApplicationjsonHttpsenforced](x: Self) {
    
    inline def setContent(value: ApplicationjsonHttpsenforced): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
