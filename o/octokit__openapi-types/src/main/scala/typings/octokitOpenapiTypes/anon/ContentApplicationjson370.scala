package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson370 extends StObject {
  
  var content: Applicationjson370
}
object ContentApplicationjson370 {
  
  inline def apply(content: Applicationjson370): ContentApplicationjson370 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson370]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson370] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson370): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
