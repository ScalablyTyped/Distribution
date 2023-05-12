package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoryselection extends StObject {
  
  var content: ApplicationjsonRepositoryselection
  
  var headers: Link
}
object ContentApplicationjsonRepositoryselection {
  
  inline def apply(content: ApplicationjsonRepositoryselection, headers: Link): ContentApplicationjsonRepositoryselection = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoryselection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRepositoryselection] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRepositoryselection): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
