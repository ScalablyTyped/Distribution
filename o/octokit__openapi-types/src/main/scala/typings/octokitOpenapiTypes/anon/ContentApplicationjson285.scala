package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson285 extends StObject {
  
  var content: Applicationjson285
}
object ContentApplicationjson285 {
  
  inline def apply(content: Applicationjson285): ContentApplicationjson285 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson285]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson285] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson285): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
