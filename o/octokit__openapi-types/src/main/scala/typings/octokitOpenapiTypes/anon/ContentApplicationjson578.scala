package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson578 extends StObject {
  
  var content: Applicationjson578
}
object ContentApplicationjson578 {
  
  inline def apply(content: Applicationjson578): ContentApplicationjson578 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson578]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson578] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson578): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
