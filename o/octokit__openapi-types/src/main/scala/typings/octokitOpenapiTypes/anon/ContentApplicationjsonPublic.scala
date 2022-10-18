package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPublic extends StObject {
  
  var content: ApplicationjsonPublic
}
object ContentApplicationjsonPublic {
  
  inline def apply(content: ApplicationjsonPublic): ContentApplicationjsonPublic = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPublic]
  }
  
  extension [Self <: ContentApplicationjsonPublic](x: Self) {
    
    inline def setContent(value: ApplicationjsonPublic): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
