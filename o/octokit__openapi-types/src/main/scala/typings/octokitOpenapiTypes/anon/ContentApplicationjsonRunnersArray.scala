package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRunnersArray extends StObject {
  
  var content: ApplicationjsonRunnersArray
}
object ContentApplicationjsonRunnersArray {
  
  inline def apply(content: ApplicationjsonRunnersArray): ContentApplicationjsonRunnersArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRunnersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRunnersArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRunnersArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
