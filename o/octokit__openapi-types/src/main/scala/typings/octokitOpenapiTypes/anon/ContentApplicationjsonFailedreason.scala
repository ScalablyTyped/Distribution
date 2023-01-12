package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonFailedreason extends StObject {
  
  var content: ApplicationjsonFailedreason
}
object ContentApplicationjsonFailedreason {
  
  inline def apply(content: ApplicationjsonFailedreason): ContentApplicationjsonFailedreason = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonFailedreason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonFailedreason] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonFailedreason): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
