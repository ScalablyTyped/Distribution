package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIdletimeoutnotice extends StObject {
  
  var content: ApplicationjsonIdletimeoutnotice
}
object ContentApplicationjsonIdletimeoutnotice {
  
  inline def apply(content: ApplicationjsonIdletimeoutnotice): ContentApplicationjsonIdletimeoutnotice = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIdletimeoutnotice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonIdletimeoutnotice] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonIdletimeoutnotice): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
