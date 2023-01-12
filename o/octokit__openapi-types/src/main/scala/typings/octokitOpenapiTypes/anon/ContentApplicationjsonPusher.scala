package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPusher extends StObject {
  
  var content: ApplicationjsonPusher
}
object ContentApplicationjsonPusher {
  
  inline def apply(content: ApplicationjsonPusher): ContentApplicationjsonPusher = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPusher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonPusher] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonPusher): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
