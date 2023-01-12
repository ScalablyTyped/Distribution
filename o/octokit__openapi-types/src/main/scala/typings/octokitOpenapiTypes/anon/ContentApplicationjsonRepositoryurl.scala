package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoryurl extends StObject {
  
  var content: ApplicationjsonRepositoryurl
}
object ContentApplicationjsonRepositoryurl {
  
  inline def apply(content: ApplicationjsonRepositoryurl): ContentApplicationjsonRepositoryurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoryurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRepositoryurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRepositoryurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
