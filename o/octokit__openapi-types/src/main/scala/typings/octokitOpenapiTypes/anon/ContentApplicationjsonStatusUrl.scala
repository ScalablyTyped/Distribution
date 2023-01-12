package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonStatusUrl extends StObject {
  
  var content: ApplicationjsonStatusUrl
}
object ContentApplicationjsonStatusUrl {
  
  inline def apply(content: ApplicationjsonStatusUrl): ContentApplicationjsonStatusUrl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonStatusUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonStatusUrl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonStatusUrl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
