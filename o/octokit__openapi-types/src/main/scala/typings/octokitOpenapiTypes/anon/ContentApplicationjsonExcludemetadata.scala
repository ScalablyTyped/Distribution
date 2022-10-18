package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonExcludemetadata extends StObject {
  
  var content: ApplicationjsonExcludemetadata
}
object ContentApplicationjsonExcludemetadata {
  
  inline def apply(content: ApplicationjsonExcludemetadata): ContentApplicationjsonExcludemetadata = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonExcludemetadata]
  }
  
  extension [Self <: ContentApplicationjsonExcludemetadata](x: Self) {
    
    inline def setContent(value: ApplicationjsonExcludemetadata): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
