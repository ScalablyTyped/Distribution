package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEnabledId extends StObject {
  
  var content: ApplicationjsonEnabledId
}
object ContentApplicationjsonEnabledId {
  
  inline def apply(content: ApplicationjsonEnabledId): ContentApplicationjsonEnabledId = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEnabledId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonEnabledId] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonEnabledId): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
