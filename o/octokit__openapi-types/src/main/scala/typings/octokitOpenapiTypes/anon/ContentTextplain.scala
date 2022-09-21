package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTextplain extends StObject {
  
  var content: Textplain
}
object ContentTextplain {
  
  inline def apply(content: Textplain): ContentTextplain = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTextplain]
  }
  
  extension [Self <: ContentTextplain](x: Self) {
    
    inline def setContent(value: Textplain): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
