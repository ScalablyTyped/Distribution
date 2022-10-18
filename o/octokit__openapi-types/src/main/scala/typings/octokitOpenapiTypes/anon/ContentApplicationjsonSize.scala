package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSize extends StObject {
  
  var content: ApplicationjsonSize
}
object ContentApplicationjsonSize {
  
  inline def apply(content: ApplicationjsonSize): ContentApplicationjsonSize = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSize]
  }
  
  extension [Self <: ContentApplicationjsonSize](x: Self) {
    
    inline def setContent(value: ApplicationjsonSize): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
