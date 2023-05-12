package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonUpdatedatValue extends StObject {
  
  var content: ApplicationjsonUpdatedatValue
}
object ContentApplicationjsonUpdatedatValue {
  
  inline def apply(content: ApplicationjsonUpdatedatValue): ContentApplicationjsonUpdatedatValue = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonUpdatedatValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonUpdatedatValue] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonUpdatedatValue): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
