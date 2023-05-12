package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoriesRepositoryselectionTotalcount extends StObject {
  
  var content: ApplicationjsonRepositoriesRepositoryselectionTotalcount
  
  var headers: LinkString
}
object ContentApplicationjsonRepositoriesRepositoryselectionTotalcount {
  
  inline def apply(content: ApplicationjsonRepositoriesRepositoryselectionTotalcount, headers: LinkString): ContentApplicationjsonRepositoriesRepositoryselectionTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoriesRepositoryselectionTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRepositoriesRepositoryselectionTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRepositoriesRepositoryselectionTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
