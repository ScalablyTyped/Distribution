package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOwnerPackagetype extends StObject {
  
  var content: ApplicationjsonOwnerPackagetype
}
object ContentApplicationjsonOwnerPackagetype {
  
  inline def apply(content: ApplicationjsonOwnerPackagetype): ContentApplicationjsonOwnerPackagetype = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOwnerPackagetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonOwnerPackagetype] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonOwnerPackagetype): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
