package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPatternString extends StObject {
  
  var content: ApplicationjsonPatternString
}
object ContentApplicationjsonPatternString {
  
  inline def apply(content: ApplicationjsonPatternString): ContentApplicationjsonPatternString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPatternString]
  }
  
  extension [Self <: ContentApplicationjsonPatternString](x: Self) {
    
    inline def setContent(value: ApplicationjsonPatternString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
