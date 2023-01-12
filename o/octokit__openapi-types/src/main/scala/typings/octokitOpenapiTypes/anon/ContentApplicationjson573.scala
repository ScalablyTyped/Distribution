package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson573 extends StObject {
  
  var content: Applicationjson573
}
object ContentApplicationjson573 {
  
  inline def apply(content: Applicationjson573): ContentApplicationjson573 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson573]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson573] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson573): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
