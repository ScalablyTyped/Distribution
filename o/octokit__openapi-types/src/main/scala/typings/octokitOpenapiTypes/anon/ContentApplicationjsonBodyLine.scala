package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyLine extends StObject {
  
  var content: ApplicationjsonBodyLine
}
object ContentApplicationjsonBodyLine {
  
  inline def apply(content: ApplicationjsonBodyLine): ContentApplicationjsonBodyLine = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyLine]
  }
  
  extension [Self <: ContentApplicationjsonBodyLine](x: Self) {
    
    inline def setContent(value: ApplicationjsonBodyLine): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
