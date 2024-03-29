package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDescription extends StObject {
  
  var content: ApplicationjsonDescription
}
object ContentApplicationjsonDescription {
  
  inline def apply(content: ApplicationjsonDescription): ContentApplicationjsonDescription = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDescription] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDescription): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
