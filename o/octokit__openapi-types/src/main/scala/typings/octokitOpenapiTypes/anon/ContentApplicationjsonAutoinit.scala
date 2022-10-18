package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAutoinit extends StObject {
  
  var content: ApplicationjsonAutoinit
}
object ContentApplicationjsonAutoinit {
  
  inline def apply(content: ApplicationjsonAutoinit): ContentApplicationjsonAutoinit = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAutoinit]
  }
  
  extension [Self <: ContentApplicationjsonAutoinit](x: Self) {
    
    inline def setContent(value: ApplicationjsonAutoinit): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
