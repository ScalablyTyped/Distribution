package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCodespacesTotalcount extends StObject {
  
  var content: ApplicationjsonCodespacesTotalcount
}
object ContentApplicationjsonCodespacesTotalcount {
  
  inline def apply(content: ApplicationjsonCodespacesTotalcount): ContentApplicationjsonCodespacesTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCodespacesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCodespacesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCodespacesTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
