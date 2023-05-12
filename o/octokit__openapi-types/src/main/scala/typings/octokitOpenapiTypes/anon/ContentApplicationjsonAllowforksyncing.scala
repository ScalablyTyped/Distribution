package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAllowforksyncing extends StObject {
  
  var content: ApplicationjsonAllowforksyncing
}
object ContentApplicationjsonAllowforksyncing {
  
  inline def apply(content: ApplicationjsonAllowforksyncing): ContentApplicationjsonAllowforksyncing = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAllowforksyncing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAllowforksyncing] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAllowforksyncing): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
