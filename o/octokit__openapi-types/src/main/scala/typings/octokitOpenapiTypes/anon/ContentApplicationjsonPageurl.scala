package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPageurl extends StObject {
  
  var content: ApplicationjsonPageurl
}
object ContentApplicationjsonPageurl {
  
  inline def apply(content: ApplicationjsonPageurl): ContentApplicationjsonPageurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPageurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonPageurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonPageurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
