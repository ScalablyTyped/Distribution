package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRestrictedtoworkflows extends StObject {
  
  var content: ApplicationjsonRestrictedtoworkflows
}
object ContentApplicationjsonRestrictedtoworkflows {
  
  inline def apply(content: ApplicationjsonRestrictedtoworkflows): ContentApplicationjsonRestrictedtoworkflows = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRestrictedtoworkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRestrictedtoworkflows] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRestrictedtoworkflows): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
