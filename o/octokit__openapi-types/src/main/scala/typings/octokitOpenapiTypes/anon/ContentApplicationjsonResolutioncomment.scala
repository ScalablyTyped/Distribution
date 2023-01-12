package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonResolutioncomment extends StObject {
  
  var content: ApplicationjsonResolutioncomment
}
object ContentApplicationjsonResolutioncomment {
  
  inline def apply(content: ApplicationjsonResolutioncomment): ContentApplicationjsonResolutioncomment = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonResolutioncomment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonResolutioncomment] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonResolutioncomment): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
