package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBlock extends StObject {
  
  var content: ApplicationjsonBlock
}
object ContentApplicationjsonBlock {
  
  inline def apply(content: ApplicationjsonBlock): ContentApplicationjsonBlock = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBlock]
  }
  
  extension [Self <: ContentApplicationjsonBlock](x: Self) {
    
    inline def setContent(value: ApplicationjsonBlock): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
