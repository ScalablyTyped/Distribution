package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyComments extends StObject {
  
  var content: ApplicationjsonBodyComments
}
object ContentApplicationjsonBodyComments {
  
  inline def apply(content: ApplicationjsonBodyComments): ContentApplicationjsonBodyComments = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyComments]
  }
  
  extension [Self <: ContentApplicationjsonBodyComments](x: Self) {
    
    inline def setContent(value: ApplicationjsonBodyComments): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
