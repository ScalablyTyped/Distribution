package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLabelsArray extends StObject {
  
  var content: ApplicationjsonLabelsArray
}
object ContentApplicationjsonLabelsArray {
  
  inline def apply(content: ApplicationjsonLabelsArray): ContentApplicationjsonLabelsArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLabelsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonLabelsArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonLabelsArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
