package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson645 extends StObject {
  
  var content: Applicationjson645
}
object ContentApplicationjson645 {
  
  inline def apply(content: Applicationjson645): ContentApplicationjson645 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson645]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson645] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson645): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
