package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonHead extends StObject {
  
  var content: ApplicationjsonHead
}
object ContentApplicationjsonHead {
  
  inline def apply(content: ApplicationjsonHead): ContentApplicationjsonHead = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonHead]
  }
  
  extension [Self <: ContentApplicationjsonHead](x: Self) {
    
    inline def setContent(value: ApplicationjsonHead): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
