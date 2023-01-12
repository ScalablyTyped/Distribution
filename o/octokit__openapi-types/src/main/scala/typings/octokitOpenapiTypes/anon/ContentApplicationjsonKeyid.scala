package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonKeyid extends StObject {
  
  var content: ApplicationjsonKeyid
}
object ContentApplicationjsonKeyid {
  
  inline def apply(content: ApplicationjsonKeyid): ContentApplicationjsonKeyid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonKeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonKeyid] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonKeyid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
