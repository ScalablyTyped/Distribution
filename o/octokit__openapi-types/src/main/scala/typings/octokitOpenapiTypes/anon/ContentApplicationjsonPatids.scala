package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPatids extends StObject {
  
  var content: ApplicationjsonPatids
}
object ContentApplicationjsonPatids {
  
  inline def apply(content: ApplicationjsonPatids): ContentApplicationjsonPatids = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPatids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonPatids] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonPatids): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
