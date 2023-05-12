package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonValue extends StObject {
  
  var content: ApplicationjsonValue
}
object ContentApplicationjsonValue {
  
  inline def apply(content: ApplicationjsonValue): ContentApplicationjsonValue = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonValue] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonValue): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
