package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNamePrivate extends StObject {
  
  var content: ApplicationjsonNamePrivate
}
object ContentApplicationjsonNamePrivate {
  
  inline def apply(content: ApplicationjsonNamePrivate): ContentApplicationjsonNamePrivate = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNamePrivate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonNamePrivate] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonNamePrivate): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
