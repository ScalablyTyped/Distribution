package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAllowspublicrepositories extends StObject {
  
  var content: ApplicationjsonAllowspublicrepositories
}
object ContentApplicationjsonAllowspublicrepositories {
  
  inline def apply(content: ApplicationjsonAllowspublicrepositories): ContentApplicationjsonAllowspublicrepositories = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAllowspublicrepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAllowspublicrepositories] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAllowspublicrepositories): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
