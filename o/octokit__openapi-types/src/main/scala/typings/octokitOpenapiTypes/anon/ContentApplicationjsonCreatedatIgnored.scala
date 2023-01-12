package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCreatedatIgnored extends StObject {
  
  var content: ApplicationjsonCreatedatIgnored
}
object ContentApplicationjsonCreatedatIgnored {
  
  inline def apply(content: ApplicationjsonCreatedatIgnored): ContentApplicationjsonCreatedatIgnored = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCreatedatIgnored]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCreatedatIgnored] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCreatedatIgnored): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
