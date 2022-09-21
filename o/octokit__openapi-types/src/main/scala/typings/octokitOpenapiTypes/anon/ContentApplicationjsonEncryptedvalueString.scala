package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEncryptedvalueString extends StObject {
  
  var content: ApplicationjsonEncryptedvalueString
}
object ContentApplicationjsonEncryptedvalueString {
  
  inline def apply(content: ApplicationjsonEncryptedvalueString): ContentApplicationjsonEncryptedvalueString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEncryptedvalueString]
  }
  
  extension [Self <: ContentApplicationjsonEncryptedvalueString](x: Self) {
    
    inline def setContent(value: ApplicationjsonEncryptedvalueString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
