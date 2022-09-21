package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEncryptedvalue extends StObject {
  
  var content: ApplicationjsonEncryptedvalue
}
object ContentApplicationjsonEncryptedvalue {
  
  inline def apply(content: ApplicationjsonEncryptedvalue): ContentApplicationjsonEncryptedvalue = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEncryptedvalue]
  }
  
  extension [Self <: ContentApplicationjsonEncryptedvalue](x: Self) {
    
    inline def setContent(value: ApplicationjsonEncryptedvalue): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
