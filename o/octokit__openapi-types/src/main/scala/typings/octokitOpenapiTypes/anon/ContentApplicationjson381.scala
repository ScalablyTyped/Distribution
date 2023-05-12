package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson381 extends StObject {
  
  var content: Applicationjson381
}
object ContentApplicationjson381 {
  
  inline def apply(content: Applicationjson381): ContentApplicationjson381 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson381]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson381] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson381): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
