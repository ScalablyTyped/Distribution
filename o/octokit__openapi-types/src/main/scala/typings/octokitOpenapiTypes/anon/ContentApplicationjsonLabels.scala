package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLabels extends StObject {
  
  var content: ApplicationjsonLabels
}
object ContentApplicationjsonLabels {
  
  inline def apply(content: ApplicationjsonLabels): ContentApplicationjsonLabels = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonLabels] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonLabels): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
