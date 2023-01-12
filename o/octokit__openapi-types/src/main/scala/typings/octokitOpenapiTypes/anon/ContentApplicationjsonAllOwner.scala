package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAllOwner extends StObject {
  
  var content: ApplicationjsonAllOwner
}
object ContentApplicationjsonAllOwner {
  
  inline def apply(content: ApplicationjsonAllOwner): ContentApplicationjsonAllOwner = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAllOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAllOwner] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAllOwner): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
