package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRules extends StObject {
  
  var content: ApplicationjsonRules
}
object ContentApplicationjsonRules {
  
  inline def apply(content: ApplicationjsonRules): ContentApplicationjsonRules = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRules] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRules): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
