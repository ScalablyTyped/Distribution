package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEnvironments extends StObject {
  
  var content: ApplicationjsonEnvironments
}
object ContentApplicationjsonEnvironments {
  
  inline def apply(content: ApplicationjsonEnvironments): ContentApplicationjsonEnvironments = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEnvironments]
  }
  
  extension [Self <: ContentApplicationjsonEnvironments](x: Self) {
    
    inline def setContent(value: ApplicationjsonEnvironments): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
