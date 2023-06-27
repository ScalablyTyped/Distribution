package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson468 extends StObject {
  
  var content: Applicationjson468
}
object ContentApplicationjson468 {
  
  inline def apply(content: Applicationjson468): ContentApplicationjson468 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson468]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson468] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson468): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
