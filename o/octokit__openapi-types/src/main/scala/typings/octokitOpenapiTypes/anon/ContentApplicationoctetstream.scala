package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationoctetstream extends StObject {
  
  var content: Applicationoctetstream
}
object ContentApplicationoctetstream {
  
  inline def apply(content: Applicationoctetstream): ContentApplicationoctetstream = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationoctetstream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationoctetstream] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationoctetstream): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
