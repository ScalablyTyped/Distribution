package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonStats extends StObject {
  
  var content: ApplicationjsonStats
}
object ContentApplicationjsonStats {
  
  inline def apply(content: ApplicationjsonStats): ContentApplicationjsonStats = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonStats]
  }
  
  extension [Self <: ContentApplicationjsonStats](x: Self) {
    
    inline def setContent(value: ApplicationjsonStats): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
