package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDocumentation extends StObject {
  
  var content: ApplicationjsonDocumentation
}
object ContentApplicationjsonDocumentation {
  
  inline def apply(content: ApplicationjsonDocumentation): ContentApplicationjsonDocumentation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDocumentation]
  }
  
  extension [Self <: ContentApplicationjsonDocumentation](x: Self) {
    
    inline def setContent(value: ApplicationjsonDocumentation): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
