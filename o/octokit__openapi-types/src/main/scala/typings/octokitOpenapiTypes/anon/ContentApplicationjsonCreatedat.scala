package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCreatedat extends StObject {
  
  var content: ApplicationjsonCreatedat
}
object ContentApplicationjsonCreatedat {
  
  inline def apply(content: ApplicationjsonCreatedat): ContentApplicationjsonCreatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCreatedat]
  }
  
  extension [Self <: ContentApplicationjsonCreatedat](x: Self) {
    
    inline def setContent(value: ApplicationjsonCreatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
