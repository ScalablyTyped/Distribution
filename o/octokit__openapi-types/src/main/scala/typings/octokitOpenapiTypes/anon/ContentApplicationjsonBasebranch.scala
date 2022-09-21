package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBasebranch extends StObject {
  
  var content: ApplicationjsonBasebranch
}
object ContentApplicationjsonBasebranch {
  
  inline def apply(content: ApplicationjsonBasebranch): ContentApplicationjsonBasebranch = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBasebranch]
  }
  
  extension [Self <: ContentApplicationjsonBasebranch](x: Self) {
    
    inline def setContent(value: ApplicationjsonBasebranch): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
