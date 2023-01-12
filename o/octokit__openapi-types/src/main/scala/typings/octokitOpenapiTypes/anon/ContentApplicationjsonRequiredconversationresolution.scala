package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRequiredconversationresolution extends StObject {
  
  var content: ApplicationjsonRequiredconversationresolution
}
object ContentApplicationjsonRequiredconversationresolution {
  
  inline def apply(content: ApplicationjsonRequiredconversationresolution): ContentApplicationjsonRequiredconversationresolution = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRequiredconversationresolution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRequiredconversationresolution] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRequiredconversationresolution): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
