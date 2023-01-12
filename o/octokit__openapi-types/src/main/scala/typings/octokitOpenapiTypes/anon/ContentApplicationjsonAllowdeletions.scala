package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAllowdeletions extends StObject {
  
  var content: ApplicationjsonAllowdeletions
}
object ContentApplicationjsonAllowdeletions {
  
  inline def apply(content: ApplicationjsonAllowdeletions): ContentApplicationjsonAllowdeletions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAllowdeletions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAllowdeletions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAllowdeletions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
