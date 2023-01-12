package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonKeyidSelectedrepositoryids extends StObject {
  
  var content: ApplicationjsonKeyidSelectedrepositoryids
}
object ContentApplicationjsonKeyidSelectedrepositoryids {
  
  inline def apply(content: ApplicationjsonKeyidSelectedrepositoryids): ContentApplicationjsonKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonKeyidSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonKeyidSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonKeyidSelectedrepositoryids): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
