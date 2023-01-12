package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonColorDescription extends StObject {
  
  var content: ApplicationjsonColorDescription
}
object ContentApplicationjsonColorDescription {
  
  inline def apply(content: ApplicationjsonColorDescription): ContentApplicationjsonColorDescription = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonColorDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonColorDescription] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonColorDescription): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
