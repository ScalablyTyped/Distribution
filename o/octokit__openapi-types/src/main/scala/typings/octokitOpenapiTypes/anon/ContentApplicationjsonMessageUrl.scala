package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMessageUrl extends StObject {
  
  var content: ApplicationjsonMessageUrl
}
object ContentApplicationjsonMessageUrl {
  
  inline def apply(content: ApplicationjsonMessageUrl): ContentApplicationjsonMessageUrl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMessageUrl]
  }
  
  extension [Self <: ContentApplicationjsonMessageUrl](x: Self) {
    
    inline def setContent(value: ApplicationjsonMessageUrl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
