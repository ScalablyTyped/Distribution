package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTitle extends StObject {
  
  var content: ApplicationjsonTitle
}
object ContentApplicationjsonTitle {
  
  inline def apply(content: ApplicationjsonTitle): ContentApplicationjsonTitle = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTitle]
  }
  
  extension [Self <: ContentApplicationjsonTitle](x: Self) {
    
    inline def setContent(value: ApplicationjsonTitle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
