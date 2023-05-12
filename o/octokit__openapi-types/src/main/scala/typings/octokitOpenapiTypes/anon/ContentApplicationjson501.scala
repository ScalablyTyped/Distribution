package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson501 extends StObject {
  
  var content: Applicationjson501
}
object ContentApplicationjson501 {
  
  inline def apply(content: Applicationjson501): ContentApplicationjson501 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson501]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson501] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson501): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
