package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBasecommit extends StObject {
  
  var content: ApplicationjsonBasecommit
}
object ContentApplicationjsonBasecommit {
  
  inline def apply(content: ApplicationjsonBasecommit): ContentApplicationjsonBasecommit = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBasecommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBasecommit] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBasecommit): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
