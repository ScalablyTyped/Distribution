package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonResult extends StObject {
  
  var content: ApplicationjsonResult
}
object ContentApplicationjsonResult {
  
  inline def apply(content: ApplicationjsonResult): ContentApplicationjsonResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonResult]
  }
  
  extension [Self <: ContentApplicationjsonResult](x: Self) {
    
    inline def setContent(value: ApplicationjsonResult): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
