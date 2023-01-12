package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoryselectionTotalcount extends StObject {
  
  var content: ApplicationjsonRepositoryselectionTotalcount
}
object ContentApplicationjsonRepositoryselectionTotalcount {
  
  inline def apply(content: ApplicationjsonRepositoryselectionTotalcount): ContentApplicationjsonRepositoryselectionTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoryselectionTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRepositoryselectionTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRepositoryselectionTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
