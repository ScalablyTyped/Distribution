package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoriesTotalcount extends StObject {
  
  var content: ApplicationjsonRepositoriesTotalcount
}
object ContentApplicationjsonRepositoriesTotalcount {
  
  inline def apply(content: ApplicationjsonRepositoriesTotalcount): ContentApplicationjsonRepositoriesTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoriesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRepositoriesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRepositoriesTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
