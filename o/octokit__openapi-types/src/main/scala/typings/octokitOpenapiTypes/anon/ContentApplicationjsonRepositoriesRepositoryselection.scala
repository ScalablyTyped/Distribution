package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoriesRepositoryselection extends StObject {
  
  var content: ApplicationjsonRepositoriesRepositoryselection
  
  var headers: Link
}
object ContentApplicationjsonRepositoriesRepositoryselection {
  
  inline def apply(content: ApplicationjsonRepositoriesRepositoryselection, headers: Link): ContentApplicationjsonRepositoriesRepositoryselection = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoriesRepositoryselection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRepositoriesRepositoryselection] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRepositoriesRepositoryselection): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
