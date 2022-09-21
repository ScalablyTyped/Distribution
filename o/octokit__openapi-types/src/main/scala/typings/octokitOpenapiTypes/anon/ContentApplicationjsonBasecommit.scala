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
  
  extension [Self <: ContentApplicationjsonBasecommit](x: Self) {
    
    inline def setContent(value: ApplicationjsonBasecommit): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
