package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonUselfs extends StObject {
  
  var content: ApplicationjsonUselfs
}
object ContentApplicationjsonUselfs {
  
  inline def apply(content: ApplicationjsonUselfs): ContentApplicationjsonUselfs = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonUselfs]
  }
  
  extension [Self <: ContentApplicationjsonUselfs](x: Self) {
    
    inline def setContent(value: ApplicationjsonUselfs): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
