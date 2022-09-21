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
  
  extension [Self <: ContentApplicationjsonsarif](x: Self) {
    
    inline def setContent(value: Applicationjsonsarif): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
