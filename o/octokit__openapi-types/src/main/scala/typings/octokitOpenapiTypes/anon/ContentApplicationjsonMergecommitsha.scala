package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMergecommitsha extends StObject {
  
  var content: ApplicationjsonMergecommitsha
}
object ContentApplicationjsonMergecommitsha {
  
  inline def apply(content: ApplicationjsonMergecommitsha): ContentApplicationjsonMergecommitsha = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMergecommitsha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonMergecommitsha] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMergecommitsha): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
