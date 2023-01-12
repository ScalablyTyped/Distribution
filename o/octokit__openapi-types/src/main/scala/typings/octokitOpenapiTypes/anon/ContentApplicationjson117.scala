package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson117 extends StObject {
  
  var content: Applicationjson117
}
object ContentApplicationjson117 {
  
  inline def apply(content: Applicationjson117): ContentApplicationjson117 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson117]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson117] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson117): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
