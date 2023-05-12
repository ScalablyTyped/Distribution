package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson276 extends StObject {
  
  var content: Applicationjson276
}
object ContentApplicationjson276 {
  
  inline def apply(content: Applicationjson276): ContentApplicationjson276 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson276]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson276] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson276): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
