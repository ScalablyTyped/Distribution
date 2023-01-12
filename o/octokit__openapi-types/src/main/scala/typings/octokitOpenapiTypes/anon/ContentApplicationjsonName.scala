package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonName extends StObject {
  
  var content: ApplicationjsonName
}
object ContentApplicationjsonName {
  
  inline def apply(content: ApplicationjsonName): ContentApplicationjsonName = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonName] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonName): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
