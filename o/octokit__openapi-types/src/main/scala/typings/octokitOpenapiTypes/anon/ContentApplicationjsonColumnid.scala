package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonColumnid extends StObject {
  
  var content: ApplicationjsonColumnid
}
object ContentApplicationjsonColumnid {
  
  inline def apply(content: ApplicationjsonColumnid): ContentApplicationjsonColumnid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonColumnid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonColumnid] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonColumnid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
