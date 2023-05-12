package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRundurationms extends StObject {
  
  var content: ApplicationjsonRundurationms
}
object ContentApplicationjsonRundurationms {
  
  inline def apply(content: ApplicationjsonRundurationms): ContentApplicationjsonRundurationms = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRundurationms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRundurationms] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRundurationms): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
