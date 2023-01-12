package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEncryptedvalueKeyid extends StObject {
  
  var content: ApplicationjsonEncryptedvalueKeyid
}
object ContentApplicationjsonEncryptedvalueKeyid {
  
  inline def apply(content: ApplicationjsonEncryptedvalueKeyid): ContentApplicationjsonEncryptedvalueKeyid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEncryptedvalueKeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonEncryptedvalueKeyid] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonEncryptedvalueKeyid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
