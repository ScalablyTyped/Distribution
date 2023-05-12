package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNotificationsetting extends StObject {
  
  var content: ApplicationjsonNotificationsetting
}
object ContentApplicationjsonNotificationsetting {
  
  inline def apply(content: ApplicationjsonNotificationsetting): ContentApplicationjsonNotificationsetting = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNotificationsetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonNotificationsetting] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonNotificationsetting): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
