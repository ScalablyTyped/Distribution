package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSelectedworkflows extends StObject {
  
  var content: ApplicationjsonSelectedworkflows
}
object ContentApplicationjsonSelectedworkflows {
  
  inline def apply(content: ApplicationjsonSelectedworkflows): ContentApplicationjsonSelectedworkflows = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSelectedworkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonSelectedworkflows] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonSelectedworkflows): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
