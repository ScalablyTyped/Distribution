package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBaseBody extends StObject {
  
  var content: ApplicationjsonBaseBody
}
object ContentApplicationjsonBaseBody {
  
  inline def apply(content: ApplicationjsonBaseBody): ContentApplicationjsonBaseBody = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBaseBody]
  }
  
  extension [Self <: ContentApplicationjsonBaseBody](x: Self) {
    
    inline def setContent(value: ApplicationjsonBaseBody): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
