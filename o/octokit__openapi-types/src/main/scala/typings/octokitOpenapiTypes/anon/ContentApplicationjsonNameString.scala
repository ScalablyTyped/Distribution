package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNameString extends StObject {
  
  var content: ApplicationjsonNameString
}
object ContentApplicationjsonNameString {
  
  inline def apply(content: ApplicationjsonNameString): ContentApplicationjsonNameString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNameString]
  }
  
  extension [Self <: ContentApplicationjsonNameString](x: Self) {
    
    inline def setContent(value: ApplicationjsonNameString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
