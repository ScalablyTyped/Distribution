package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoryids extends StObject {
  
  var content: ApplicationjsonRepositoryids
}
object ContentApplicationjsonRepositoryids {
  
  inline def apply(content: ApplicationjsonRepositoryids): ContentApplicationjsonRepositoryids = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRepositoryids] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRepositoryids): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
