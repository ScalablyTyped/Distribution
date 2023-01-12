package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContactemail extends StObject {
  
  var content: ApplicationjsonContactemail
}
object ContentApplicationjsonContactemail {
  
  inline def apply(content: ApplicationjsonContactemail): ContentApplicationjsonContactemail = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContactemail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonContactemail] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonContactemail): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
