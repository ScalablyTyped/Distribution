package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMessageObject extends StObject {
  
  var content: ApplicationjsonMessageObject
}
object ContentApplicationjsonMessageObject {
  
  inline def apply(content: ApplicationjsonMessageObject): ContentApplicationjsonMessageObject = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMessageObject]
  }
  
  extension [Self <: ContentApplicationjsonMessageObject](x: Self) {
    
    inline def setContent(value: ApplicationjsonMessageObject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
