package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMaintainers extends StObject {
  
  var content: ApplicationjsonMaintainers
}
object ContentApplicationjsonMaintainers {
  
  inline def apply(content: ApplicationjsonMaintainers): ContentApplicationjsonMaintainers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMaintainers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonMaintainers] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMaintainers): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
