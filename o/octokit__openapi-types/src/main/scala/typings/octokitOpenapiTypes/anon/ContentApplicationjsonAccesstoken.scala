package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAccesstoken extends StObject {
  
  var content: ApplicationjsonAccesstoken
}
object ContentApplicationjsonAccesstoken {
  
  inline def apply(content: ApplicationjsonAccesstoken): ContentApplicationjsonAccesstoken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAccesstoken]
  }
  
  extension [Self <: ContentApplicationjsonAccesstoken](x: Self) {
    
    inline def setContent(value: ApplicationjsonAccesstoken): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
