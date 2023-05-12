package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDuration extends StObject {
  
  var content: ApplicationjsonDuration
}
object ContentApplicationjsonDuration {
  
  inline def apply(content: ApplicationjsonDuration): ContentApplicationjsonDuration = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDuration] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDuration): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
