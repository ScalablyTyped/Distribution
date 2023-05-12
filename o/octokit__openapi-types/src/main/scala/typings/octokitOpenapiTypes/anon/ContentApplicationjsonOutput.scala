package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOutput extends StObject {
  
  var content: ApplicationjsonOutput
}
object ContentApplicationjsonOutput {
  
  inline def apply(content: ApplicationjsonOutput): ContentApplicationjsonOutput = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonOutput] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonOutput): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
