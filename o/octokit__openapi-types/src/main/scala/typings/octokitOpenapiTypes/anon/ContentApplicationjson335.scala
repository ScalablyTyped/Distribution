package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson335 extends StObject {
  
  var content: Applicationjson335
}
object ContentApplicationjson335 {
  
  inline def apply(content: Applicationjson335): ContentApplicationjson335 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson335]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson335] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson335): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
