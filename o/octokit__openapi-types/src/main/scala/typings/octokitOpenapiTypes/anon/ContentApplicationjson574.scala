package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson574 extends StObject {
  
  var content: Applicationjson574
}
object ContentApplicationjson574 {
  
  inline def apply(content: Applicationjson574): ContentApplicationjson574 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson574]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson574] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson574): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
