package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonsarif extends StObject {
  
  var content: Applicationjsonsarif
}
object ContentApplicationjsonsarif {
  
  inline def apply(content: Applicationjsonsarif): ContentApplicationjsonsarif = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonsarif]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonsarif] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjsonsarif): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
