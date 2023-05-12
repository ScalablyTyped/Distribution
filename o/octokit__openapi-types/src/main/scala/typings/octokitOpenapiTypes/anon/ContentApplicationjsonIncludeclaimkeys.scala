package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIncludeclaimkeys extends StObject {
  
  var content: ApplicationjsonIncludeclaimkeys
}
object ContentApplicationjsonIncludeclaimkeys {
  
  inline def apply(content: ApplicationjsonIncludeclaimkeys): ContentApplicationjsonIncludeclaimkeys = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIncludeclaimkeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonIncludeclaimkeys] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonIncludeclaimkeys): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
