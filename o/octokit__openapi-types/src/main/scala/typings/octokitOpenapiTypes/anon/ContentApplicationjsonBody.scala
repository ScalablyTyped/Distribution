package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBody extends StObject {
  
  var content: ApplicationjsonBody
}
object ContentApplicationjsonBody {
  
  inline def apply(content: ApplicationjsonBody): ContentApplicationjsonBody = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBody]
  }
  
  extension [Self <: ContentApplicationjsonBody](x: Self) {
    
    inline def setContent(value: ApplicationjsonBody): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
