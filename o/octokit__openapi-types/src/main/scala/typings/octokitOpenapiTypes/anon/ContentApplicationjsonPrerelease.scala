package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPrerelease extends StObject {
  
  var content: ApplicationjsonPrerelease
}
object ContentApplicationjsonPrerelease {
  
  inline def apply(content: ApplicationjsonPrerelease): ContentApplicationjsonPrerelease = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPrerelease]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonPrerelease] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonPrerelease): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
