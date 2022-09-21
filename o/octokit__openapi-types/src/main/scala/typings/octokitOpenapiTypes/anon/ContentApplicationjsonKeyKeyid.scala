package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonKeyKeyid extends StObject {
  
  var content: ApplicationjsonKeyKeyid
}
object ContentApplicationjsonKeyKeyid {
  
  inline def apply(content: ApplicationjsonKeyKeyid): ContentApplicationjsonKeyKeyid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonKeyKeyid]
  }
  
  extension [Self <: ContentApplicationjsonKeyKeyid](x: Self) {
    
    inline def setContent(value: ApplicationjsonKeyKeyid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
