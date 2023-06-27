package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRunner extends StObject {
  
  var content: ApplicationjsonRunner
}
object ContentApplicationjsonRunner {
  
  inline def apply(content: ApplicationjsonRunner): ContentApplicationjsonRunner = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRunner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRunner] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRunner): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
