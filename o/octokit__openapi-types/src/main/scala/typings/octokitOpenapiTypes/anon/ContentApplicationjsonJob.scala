package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonJob extends StObject {
  
  var content: ApplicationjsonJob
}
object ContentApplicationjsonJob {
  
  inline def apply(content: ApplicationjsonJob): ContentApplicationjsonJob = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonJob]
  }
  
  extension [Self <: ContentApplicationjsonJob](x: Self) {
    
    inline def setContent(value: ApplicationjsonJob): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
