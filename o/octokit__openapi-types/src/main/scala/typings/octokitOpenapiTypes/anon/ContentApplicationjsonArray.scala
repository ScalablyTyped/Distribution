package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonArray extends StObject {
  
  var content: ApplicationjsonArray
}
object ContentApplicationjsonArray {
  
  inline def apply(content: ApplicationjsonArray): ContentApplicationjsonArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
