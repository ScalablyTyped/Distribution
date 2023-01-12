package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEmail extends StObject {
  
  var content: ApplicationjsonEmail
}
object ContentApplicationjsonEmail {
  
  inline def apply(content: ApplicationjsonEmail): ContentApplicationjsonEmail = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEmail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonEmail] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonEmail): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
