package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIncludeclaimkeysArray extends StObject {
  
  var content: ApplicationjsonIncludeclaimkeysArray
}
object ContentApplicationjsonIncludeclaimkeysArray {
  
  inline def apply(content: ApplicationjsonIncludeclaimkeysArray): ContentApplicationjsonIncludeclaimkeysArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIncludeclaimkeysArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonIncludeclaimkeysArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonIncludeclaimkeysArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
