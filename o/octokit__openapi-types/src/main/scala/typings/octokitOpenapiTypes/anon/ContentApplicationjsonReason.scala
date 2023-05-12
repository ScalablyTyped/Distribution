package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonReason extends StObject {
  
  var content: ApplicationjsonReason
}
object ContentApplicationjsonReason {
  
  inline def apply(content: ApplicationjsonReason): ContentApplicationjsonReason = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonReason] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonReason): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
