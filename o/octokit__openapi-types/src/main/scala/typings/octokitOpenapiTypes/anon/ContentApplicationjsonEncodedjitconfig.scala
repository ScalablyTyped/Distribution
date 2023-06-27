package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEncodedjitconfig extends StObject {
  
  var content: ApplicationjsonEncodedjitconfig
}
object ContentApplicationjsonEncodedjitconfig {
  
  inline def apply(content: ApplicationjsonEncodedjitconfig): ContentApplicationjsonEncodedjitconfig = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEncodedjitconfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonEncodedjitconfig] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonEncodedjitconfig): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
