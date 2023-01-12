package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCreatedatId extends StObject {
  
  var content: ApplicationjsonCreatedatId
}
object ContentApplicationjsonCreatedatId {
  
  inline def apply(content: ApplicationjsonCreatedatId): ContentApplicationjsonCreatedatId = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCreatedatId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCreatedatId] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCreatedatId): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
