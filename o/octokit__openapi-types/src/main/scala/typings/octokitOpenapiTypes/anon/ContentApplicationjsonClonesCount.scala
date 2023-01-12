package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonClonesCount extends StObject {
  
  var content: ApplicationjsonClonesCount
}
object ContentApplicationjsonClonesCount {
  
  inline def apply(content: ApplicationjsonClonesCount): ContentApplicationjsonClonesCount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonClonesCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonClonesCount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonClonesCount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
