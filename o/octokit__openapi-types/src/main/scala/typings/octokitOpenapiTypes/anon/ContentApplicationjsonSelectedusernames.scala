package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSelectedusernames extends StObject {
  
  var content: ApplicationjsonSelectedusernames
}
object ContentApplicationjsonSelectedusernames {
  
  inline def apply(content: ApplicationjsonSelectedusernames): ContentApplicationjsonSelectedusernames = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSelectedusernames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonSelectedusernames] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonSelectedusernames): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
