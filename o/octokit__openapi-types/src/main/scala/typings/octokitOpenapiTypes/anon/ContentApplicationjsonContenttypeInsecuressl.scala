package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContenttypeInsecuressl extends StObject {
  
  var content: ApplicationjsonContenttypeInsecuressl
}
object ContentApplicationjsonContenttypeInsecuressl {
  
  inline def apply(content: ApplicationjsonContenttypeInsecuressl): ContentApplicationjsonContenttypeInsecuressl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContenttypeInsecuressl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonContenttypeInsecuressl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonContenttypeInsecuressl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
