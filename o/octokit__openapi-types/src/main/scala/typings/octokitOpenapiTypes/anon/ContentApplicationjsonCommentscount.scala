package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCommentscount extends StObject {
  
  var content: ApplicationjsonCommentscount
}
object ContentApplicationjsonCommentscount {
  
  inline def apply(content: ApplicationjsonCommentscount): ContentApplicationjsonCommentscount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCommentscount]
  }
  
  extension [Self <: ContentApplicationjsonCommentscount](x: Self) {
    
    inline def setContent(value: ApplicationjsonCommentscount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
