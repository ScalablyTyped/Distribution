package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRule extends StObject {
  
  var content: ApplicationjsonRule
}
object ContentApplicationjsonRule {
  
  inline def apply(content: ApplicationjsonRule): ContentApplicationjsonRule = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRule]
  }
  
  extension [Self <: ContentApplicationjsonRule](x: Self) {
    
    inline def setContent(value: ApplicationjsonRule): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
