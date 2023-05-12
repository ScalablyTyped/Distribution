package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContenttypeCreatedat extends StObject {
  
  var content: ApplicationjsonContenttypeCreatedat
}
object ContentApplicationjsonContenttypeCreatedat {
  
  inline def apply(content: ApplicationjsonContenttypeCreatedat): ContentApplicationjsonContenttypeCreatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContenttypeCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonContenttypeCreatedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonContenttypeCreatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
